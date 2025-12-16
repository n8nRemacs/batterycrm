package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: OptionsUpdate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\fB9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate;", "", "", "seen1", "", "videoTxAllowed", "defaultCamera", "defaultCameraEnabled", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class OptionsUpdate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f332118a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f332119b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f332120c;

    /* compiled from: OptionsUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<OptionsUpdate> serializer() {
            return OptionsUpdate$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public OptionsUpdate() {
        this((Boolean) null, (Integer) null, (Boolean) null, 7, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionsUpdate)) {
            return false;
        }
        OptionsUpdate optionsUpdate = (OptionsUpdate) obj;
        return L.f(this.f332118a, optionsUpdate.f332118a) && L.f(this.f332119b, optionsUpdate.f332119b) && L.f(this.f332120c, optionsUpdate.f332120c);
    }

    public final int hashCode() {
        Boolean bool = this.f332118a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f332119b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f332120c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionsUpdate(videoTxAllowed=");
        sb2.append(this.f332118a);
        sb2.append(", defaultCamera=");
        sb2.append(this.f332119b);
        sb2.append(", defaultCameraEnabled=");
        return C0.g(sb2, this.f332120c, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ OptionsUpdate(int i12, Boolean bool, Integer num, Boolean bool2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f332118a = null;
        } else {
            this.f332118a = bool;
        }
        if ((i12 & 2) == 0) {
            this.f332119b = null;
        } else {
            this.f332119b = num;
        }
        if ((i12 & 4) == 0) {
            this.f332120c = null;
        } else {
            this.f332120c = bool2;
        }
    }

    public OptionsUpdate(Boolean bool, Integer num, Boolean bool2, int i12, C42822w c42822w) {
        bool = (i12 & 1) != 0 ? null : bool;
        num = (i12 & 2) != 0 ? null : num;
        bool2 = (i12 & 4) != 0 ? null : bool2;
        this.f332118a = bool;
        this.f332119b = num;
        this.f332120c = bool2;
    }
}
