package com.avito.beduin.v2.interaction.detached.flow.modal;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModalImage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/a;", "", "<init>", "()V", "a", "Lcom/avito/beduin/v2/interaction/detached/flow/modal/a$a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: ModalImage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/a$a;", "Lcom/avito/beduin/v2/interaction/detached/flow/modal/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.detached.flow.modal.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10453a extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f337345a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f337346b;

        /* renamed from: c, reason: collision with root package name */
        public final int f337347c;

        /* renamed from: d, reason: collision with root package name */
        public final int f337348d;

        public C10453a(int i12, int i13, @Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f337345a = str;
            this.f337346b = str2;
            this.f337347c = i12;
            this.f337348d = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10453a)) {
                return false;
            }
            C10453a c10453a = (C10453a) obj;
            return L.f(this.f337345a, c10453a.f337345a) && L.f(this.f337346b, c10453a.f337346b) && this.f337347c == c10453a.f337347c && this.f337348d == c10453a.f337348d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f337348d) + androidx.appcompat.app.r.e(this.f337347c, H.d(this.f337345a.hashCode() * 31, 31, this.f337346b), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoteImage(lightImageUrl=");
            sb2.append(this.f337345a);
            sb2.append(", darkImageUrl=");
            sb2.append(this.f337346b);
            sb2.append(", width=");
            sb2.append(this.f337347c);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f337348d, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
