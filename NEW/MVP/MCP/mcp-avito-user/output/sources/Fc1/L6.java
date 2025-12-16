package Fc1;

import androidx.compose.runtime.C22066f2;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class L6 {

    @kotlin.jvm.internal.s0
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l f5078l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar) {
            super(1);
            this.f5078l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            int i12 = kotlin.jvm.internal.J.f406821a;
            if (iIntValue != -1) {
                this.f5078l.invoke(Integer.valueOf(iIntValue));
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f5079l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5080m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.l lVar) {
            super(2);
            this.f5079l = lVar;
            this.f5080m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5080m | 1);
            L6.a(this.f5079l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r43, @Y61.l androidx.compose.runtime.A r44, int r45) {
        /*
            Method dump skipped, instructions count: 4180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.L6.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
