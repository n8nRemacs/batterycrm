package com.avito.android.remote.model;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerConnection.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/SellerConnection;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/SellerConnection$Type;", "types", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "Companion", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final class SellerConnection implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<SellerConnection> CREATOR;

    @c("title")
    @l
    private final String title;

    @c("sources")
    @k
    private final List<Type> types;

    /* compiled from: SellerConnection.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/SellerConnection$Type;", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/SellerConnection$Type;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final /* data */ class Type implements Parcelable {

        @f
        @k
        public static final Parcelable.Creator<Type> CREATOR;

        @c("type")
        @k
        private final String type;

        static {
            SellerConnection$Type$Companion$CREATOR$1 sellerConnection$Type$Companion$CREATOR$1 = SellerConnection$Type$Companion$CREATOR$1.INSTANCE;
            int i12 = I3.f318630a;
            CREATOR = new H3(sellerConnection$Type$Companion$CREATOR$1);
        }

        public Type(@k String str) {
            this.type = str;
        }

        public static /* synthetic */ Type copy$default(Type type, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = type.type;
            }
            return type.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        public final Type copy(@k String type) {
            return new Type(type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Type) && L.f(this.type, ((Type) other).type);
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Type(type="), this.type, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel dest, int flags) {
            dest.writeString(this.type);
        }
    }

    static {
        SellerConnection$Companion$CREATOR$1 sellerConnection$Companion$CREATOR$1 = SellerConnection$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(sellerConnection$Companion$CREATOR$1);
    }

    public SellerConnection(@l String str, @k List<Type> list) {
        this.title = str;
        this.types = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<Type> getTypes() {
        return this.types;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.title);
        J3.e(this.types, dest, 0);
    }
}
