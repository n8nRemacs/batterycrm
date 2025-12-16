package com.avito.android.publish.drafts.db;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InvalidSchemaException;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: LocalDraftTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/drafts/db/LocalDraftTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/publish/drafts/h;", "Lcom/google/gson/h;", "<init>", "()V", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LocalDraftTypeAdapter implements o<C33842h>, h<C33842h> {
    @SuppressLint({"HardcodeStringDetector"})
    public static String b(k kVar, String str) {
        i iVarD = kVar.D(str);
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS != null) {
            return strS;
        }
        throw new InvalidSchemaException(m0.f406844a.b(C33842h.class), str, "must not be null");
    }

    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        String strEncodeToString;
        C33842h c33842h = (C33842h) obj;
        k kVar = new k();
        kVar.y("session_id", c33842h.f235375a);
        kVar.y("draft_id", c33842h.f235376b);
        kVar.y(VoiceInfo.STATE, c33842h.f235377c);
        kVar.w(Integer.valueOf(c33842h.f235378d), "version");
        kVar.v(Boolean.valueOf(c33842h.f235379e), "has_local_changes");
        kVar.v(Boolean.valueOf(c33842h.f235380f), "sync_enabled");
        String str = c33842h.f235381g;
        if (str != null) {
            kVar.y("server_draft_id", str);
        }
        kVar.t("slots", nVar.c(c33842h.f235382h));
        kVar.t(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, nVar.c(c33842h.f235383i));
        kVar.t("navigation", nVar.c(c33842h.f235384j));
        String str2 = c33842h.f235385k;
        if (str2 != null) {
            kVar.y("active_field_id", str2);
        }
        kVar.t("local_publish_state", nVar.c(c33842h.f235386l));
        CategoryParameters categoryParameters = c33842h.f235387m;
        if (categoryParameters != null) {
            Parcel parcelObtain = Parcel.obtain();
            categoryParameters.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            strEncodeToString = Base64.encodeToString(bArrMarshall, 0);
        } else {
            strEncodeToString = null;
        }
        kVar.y("raw_category_params", strEncodeToString);
        kVar.v(Boolean.valueOf(c33842h.f235388n), "is_employee");
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [kotlin.collections.z0] */
    @Override // com.google.gson.h
    public final C33842h deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LocalPublishState localPublishState;
        String strE;
        k kVarI = iVar.i();
        String strB = b(kVarI, "session_id");
        String strB2 = b(kVarI, "draft_id");
        String strB3 = b(kVarI, VoiceInfo.STATE);
        i iVarD = kVarI.D("version");
        if (iVarD == null) {
            throw new InvalidSchemaException(m0.f406844a.b(C33842h.class), "version", "must not be null");
        }
        int iG2 = iVarD.g();
        i iVarD2 = kVarI.D("has_local_changes");
        if (iVarD2 == null) {
            throw new InvalidSchemaException(m0.f406844a.b(C33842h.class), "has_local_changes", "must not be null");
        }
        boolean zD2 = iVarD2.d();
        i iVarD3 = kVarI.D("sync_enabled");
        boolean zD3 = iVarD3 != null ? iVarD3.d() : false;
        i iVarD4 = kVarI.D("server_draft_id");
        CategoryParameters categoryParametersCreateFromParcel = null;
        String strS = iVarD4 != null ? iVarD4.s() : null;
        f fVarE = kVarI.E(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS);
        if (fVarE != null) {
            ArrayList arrayList3 = fVarE.f362000b;
            arrayList = new ArrayList(arrayList3.size());
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((i) it.next(), AttributeNode.class));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C42784z0.f406748b;
        }
        f fVarE2 = kVarI.E("slots");
        if (fVarE2 != null) {
            ArrayList arrayList4 = fVarE2.f362000b;
            arrayList2 = new ArrayList(arrayList4.size());
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(gVar.b((i) it2.next(), AttributeNode.class));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = C42784z0.f406748b;
        }
        k kVarI2 = kVarI.I("navigation");
        Navigation navigation2 = kVarI2 != null ? (Navigation) gVar.b(kVarI2, Navigation.class) : new Navigation(null, null, null, null, null, null, null, null, null, 511, null);
        i iVarD5 = kVarI.D("active_field_id");
        String strS2 = iVarD5 != null ? iVarD5.s() : null;
        k kVarI3 = kVarI.I("local_publish_state");
        LocalPublishState localPublishState2 = kVarI3 != null ? (LocalPublishState) gVar.b(kVarI3, LocalPublishState.class) : new LocalPublishState(null, null, 3, null);
        Parcelable.Creator<CategoryParameters> creator = CategoryParameters.CREATOR;
        i iVarD6 = kVarI.D("raw_category_params");
        if (iVarD6 == null || (strE = C34328m0.e(iVarD6)) == null) {
            localPublishState = localPublishState2;
        } else {
            byte[] bArrDecode = Base64.decode(strE, 0);
            Parcel parcelObtain = Parcel.obtain();
            localPublishState = localPublishState2;
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            categoryParametersCreateFromParcel = creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        CategoryParameters categoryParameters = categoryParametersCreateFromParcel;
        i iVarD7 = kVarI.D("is_employee");
        return new C33842h(strB, strB2, strB3, iG2, zD2, zD3, strS, arrayList2, arrayList, navigation2, strS2, localPublishState, categoryParameters, iVarD7 != null ? iVarD7.d() : false);
    }
}
