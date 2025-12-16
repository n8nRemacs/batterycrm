package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IceBreakers.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/IceBreakers;", "Landroid/os/Parcelable;", "", "contact", "", "Lcom/avito/android/remote/model/IceBreaker;", "texts", "description", "", "limit", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContact", "()Ljava/lang/String;", "Ljava/util/List;", "getTexts", "()Ljava/util/List;", "getDescription", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "getVersion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IceBreakers implements Parcelable {

    @k
    public static final Parcelable.Creator<IceBreakers> CREATOR = new Creator();

    @c("contact")
    @k
    private final String contact;

    @c("description")
    @l
    private final String description;

    @c("limit")
    @l
    private final Integer limit;

    @c("texts")
    @k
    private final List<IceBreaker> texts;

    @c("version")
    @l
    private final String version;

    /* compiled from: IceBreakers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IceBreakers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IceBreakers createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(IceBreaker.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new IceBreakers(string, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IceBreakers[] newArray(int i12) {
            return new IceBreakers[i12];
        }
    }

    public IceBreakers(@k String str, @k List<IceBreaker> list, @l String str2, @l Integer num, @l String str3) {
        this.contact = str;
        this.texts = list;
        this.description = str2;
        this.limit = num;
        this.version = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getContact() {
        return this.contact;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Integer getLimit() {
        return this.limit;
    }

    @k
    public final List<IceBreaker> getTexts() {
        return this.texts;
    }

    @l
    public final String getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.contact);
        Iterator itJ = C0.j(this.texts, parcel);
        while (itJ.hasNext()) {
            ((IceBreaker) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.description);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.version);
    }

    public /* synthetic */ IceBreakers(String str, List list, String str2, Integer num, String str3, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : str2, num, str3);
    }
}
