package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: WebPaymentPostMessageTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B.\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00002\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/WebPaymentPostMessageTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "", "", "LK51/e;", "postMessageParams", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onStartRedirectActions", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/Map;Ljava/util/List;)Lcom/avito/android/beduin/common/form/transforms/WebPaymentPostMessageTransform;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getPostMessageParams", "Ljava/util/List;", "getOnStartRedirectActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WebPaymentPostMessageTransform implements BeduinModelTransform {

    @k
    private final List<BeduinAction> onStartRedirectActions;

    @k
    private final Map<String, Object> postMessageParams;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<WebPaymentPostMessageTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = WebPaymentPostMessageTransform.class;

    @k
    private static final String TYPE = "webPaymentPostMessage";

    @k
    private static final String type = TYPE;

    /* compiled from: WebPaymentPostMessageTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/WebPaymentPostMessageTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.WebPaymentPostMessageTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return WebPaymentPostMessageTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return WebPaymentPostMessageTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: WebPaymentPostMessageTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WebPaymentPostMessageTransform> {
        @Override // android.os.Parcelable.Creator
        public final WebPaymentPostMessageTransform createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = h.c(WebPaymentPostMessageTransform.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(WebPaymentPostMessageTransform.class, parcel, arrayList, iL2, 1);
            }
            return new WebPaymentPostMessageTransform(linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WebPaymentPostMessageTransform[] newArray(int i12) {
            return new WebPaymentPostMessageTransform[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebPaymentPostMessageTransform(@k Map<String, ? extends Object> map, @k List<? extends BeduinAction> list) {
        this.postMessageParams = map;
        this.onStartRedirectActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebPaymentPostMessageTransform copy$default(WebPaymentPostMessageTransform webPaymentPostMessageTransform, Map map, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = webPaymentPostMessageTransform.postMessageParams;
        }
        if ((i12 & 2) != 0) {
            list = webPaymentPostMessageTransform.onStartRedirectActions;
        }
        return webPaymentPostMessageTransform.copy(map, list);
    }

    @k
    public final Map<String, Object> component1() {
        return this.postMessageParams;
    }

    @k
    public final List<BeduinAction> component2() {
        return this.onStartRedirectActions;
    }

    @k
    public final WebPaymentPostMessageTransform copy(@k Map<String, ? extends Object> postMessageParams, @k List<? extends BeduinAction> onStartRedirectActions) {
        return new WebPaymentPostMessageTransform(postMessageParams, onStartRedirectActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebPaymentPostMessageTransform)) {
            return false;
        }
        WebPaymentPostMessageTransform webPaymentPostMessageTransform = (WebPaymentPostMessageTransform) other;
        return L.f(this.postMessageParams, webPaymentPostMessageTransform.postMessageParams) && L.f(this.onStartRedirectActions, webPaymentPostMessageTransform.onStartRedirectActions);
    }

    @k
    public final List<BeduinAction> getOnStartRedirectActions() {
        return this.onStartRedirectActions;
    }

    @k
    public final Map<String, Object> getPostMessageParams() {
        return this.postMessageParams;
    }

    public int hashCode() {
        return this.onStartRedirectActions.hashCode() + (this.postMessageParams.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebPaymentPostMessageTransform(postMessageParams=");
        sb2.append(this.postMessageParams);
        sb2.append(", onStartRedirectActions=");
        return H.p(sb2, this.onStartRedirectActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itI = C0.i(parcel, this.postMessageParams);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
        Iterator itJ = C0.j(this.onStartRedirectActions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
