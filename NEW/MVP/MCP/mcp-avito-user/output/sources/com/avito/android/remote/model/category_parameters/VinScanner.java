package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VinConfig.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b.\u0010\u001fR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VinScanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/util/OpenParams;", "", "title", "Lcom/avito/android/remote/model/category_parameters/FailPage;", "failPage", "Lcom/avito/android/remote/model/category_parameters/ManualVin;", "manualVin", "loadingTitle", "Lcom/avito/android/remote/model/category_parameters/ManualScanner;", "manualScanner", "necessaryText", "Lcom/avito/android/remote/model/category_parameters/PermissionPage;", "permissionPage", "skipButtonTitle", "", "errorDescriptionMap", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/FailPage;Lcom/avito/android/remote/model/category_parameters/ManualVin;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ManualScanner;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PermissionPage;Ljava/lang/String;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/FailPage;", "getFailPage", "()Lcom/avito/android/remote/model/category_parameters/FailPage;", "Lcom/avito/android/remote/model/category_parameters/ManualVin;", "getManualVin", "()Lcom/avito/android/remote/model/category_parameters/ManualVin;", "getLoadingTitle", "Lcom/avito/android/remote/model/category_parameters/ManualScanner;", "getManualScanner", "()Lcom/avito/android/remote/model/category_parameters/ManualScanner;", "getNecessaryText", "Lcom/avito/android/remote/model/category_parameters/PermissionPage;", "getPermissionPage", "()Lcom/avito/android/remote/model/category_parameters/PermissionPage;", "getSkipButtonTitle", "Ljava/util/Map;", "getErrorDescriptionMap", "()Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VinScanner implements Parcelable, OpenParams {

    @k
    public static final Parcelable.Creator<VinScanner> CREATOR = new Creator();

    @c("errorDescriptionMap")
    @l
    private final Map<String, String> errorDescriptionMap;

    @c("failPage")
    @k
    private final FailPage failPage;

    @c("loadingTitle")
    @l
    private final String loadingTitle;

    @c("manualScanner")
    @l
    private final ManualScanner manualScanner;

    @c("manualVin")
    @l
    private final ManualVin manualVin;

    @c("necessaryText")
    @l
    private final String necessaryText;

    @c("permissionPage")
    @k
    private final PermissionPage permissionPage;

    @c("skipButtonTitle")
    @k
    private final String skipButtonTitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: VinConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VinScanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinScanner createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            FailPage failPageCreateFromParcel = FailPage.CREATOR.createFromParcel(parcel);
            LinkedHashMap linkedHashMap = null;
            ManualVin manualVinCreateFromParcel = parcel.readInt() == 0 ? null : ManualVin.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            ManualScanner manualScannerCreateFromParcel = parcel.readInt() == 0 ? null : ManualScanner.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            PermissionPage permissionPageCreateFromParcel = PermissionPage.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new VinScanner(string, failPageCreateFromParcel, manualVinCreateFromParcel, string2, manualScannerCreateFromParcel, string3, permissionPageCreateFromParcel, string4, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinScanner[] newArray(int i12) {
            return new VinScanner[i12];
        }
    }

    public VinScanner(@l String str, @k FailPage failPage, @l ManualVin manualVin, @l String str2, @l ManualScanner manualScanner, @l String str3, @k PermissionPage permissionPage, @k String str4, @l Map<String, String> map) {
        this.title = str;
        this.failPage = failPage;
        this.manualVin = manualVin;
        this.loadingTitle = str2;
        this.manualScanner = manualScanner;
        this.necessaryText = str3;
        this.permissionPage = permissionPage;
        this.skipButtonTitle = str4;
        this.errorDescriptionMap = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Map<String, String> getErrorDescriptionMap() {
        return this.errorDescriptionMap;
    }

    @k
    public final FailPage getFailPage() {
        return this.failPage;
    }

    @l
    public final String getLoadingTitle() {
        return this.loadingTitle;
    }

    @l
    public final ManualScanner getManualScanner() {
        return this.manualScanner;
    }

    @l
    public final ManualVin getManualVin() {
        return this.manualVin;
    }

    @l
    public final String getNecessaryText() {
        return this.necessaryText;
    }

    @k
    public final PermissionPage getPermissionPage() {
        return this.permissionPage;
    }

    @k
    public final String getSkipButtonTitle() {
        return this.skipButtonTitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.failPage.writeToParcel(parcel, flags);
        ManualVin manualVin = this.manualVin;
        if (manualVin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manualVin.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.loadingTitle);
        ManualScanner manualScanner = this.manualScanner;
        if (manualScanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manualScanner.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.necessaryText);
        this.permissionPage.writeToParcel(parcel, flags);
        parcel.writeString(this.skipButtonTitle);
        Map<String, String> map = this.errorDescriptionMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
