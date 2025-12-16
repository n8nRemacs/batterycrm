package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: FakeScrollTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "depth", "", "_durationSeconds", "<init>", "(ILjava/lang/Float;)V", "component2", "()Ljava/lang/Float;", "component1", "()I", "copy", "(ILjava/lang/Float;)Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDepth", "Ljava/lang/Float;", "getDurationMs", "durationMs", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FakeScrollTransform implements BeduinModelTransform {
    private static final int DURATION_DEFAULT_MS = 700;

    @c("duration")
    @l
    private final Float _durationSeconds;

    @c("depth")
    private final int depth;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<FakeScrollTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = FakeScrollTransform.class;

    @k
    private static final String TYPE = "fakeScroll";

    @k
    private static final String type = TYPE;

    /* compiled from: FakeScrollTransform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform$a;", "LTi/a;", "<init>", "()V", "", "DURATION_DEFAULT_MS", "I", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.FakeScrollTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return FakeScrollTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return FakeScrollTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: FakeScrollTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FakeScrollTransform> {
        @Override // android.os.Parcelable.Creator
        public final FakeScrollTransform createFromParcel(Parcel parcel) {
            return new FakeScrollTransform(parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final FakeScrollTransform[] newArray(int i12) {
            return new FakeScrollTransform[i12];
        }
    }

    public FakeScrollTransform(int i12, @l Float f12) {
        this.depth = i12;
        this._durationSeconds = f12;
    }

    /* renamed from: component2, reason: from getter */
    private final Float get_durationSeconds() {
        return this._durationSeconds;
    }

    public static /* synthetic */ FakeScrollTransform copy$default(FakeScrollTransform fakeScrollTransform, int i12, Float f12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = fakeScrollTransform.depth;
        }
        if ((i13 & 2) != 0) {
            f12 = fakeScrollTransform._durationSeconds;
        }
        return fakeScrollTransform.copy(i12, f12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @k
    public final FakeScrollTransform copy(int depth, @l Float _durationSeconds) {
        return new FakeScrollTransform(depth, _durationSeconds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FakeScrollTransform)) {
            return false;
        }
        FakeScrollTransform fakeScrollTransform = (FakeScrollTransform) other;
        return this.depth == fakeScrollTransform.depth && L.f(this._durationSeconds, fakeScrollTransform._durationSeconds);
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getDurationMs() {
        Float f12 = this._durationSeconds;
        return f12 != null ? (int) (f12.floatValue() * 1000) : DURATION_DEFAULT_MS;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.depth) * 31;
        Float f12 = this._durationSeconds;
        return iHashCode + (f12 == null ? 0 : f12.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FakeScrollTransform(depth=");
        sb2.append(this.depth);
        sb2.append(", _durationSeconds=");
        return h.d(sb2, this._durationSeconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.depth);
        Float f12 = this._durationSeconds;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
    }
}
