package com.avito.android.short_term_rent.bookingform.domain.validation;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: InputsValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/c;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f281439a;

    /* compiled from: InputsValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/short_term_rent/bookingform/domain/validation/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.domain.validation.InputsValidator$validate$2", f = "InputsValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<com.avito.android.short_term_rent.bookingform.domain.validation.a> f281440q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c f281441r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f281442s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.avito.android.short_term_rent.bookingform.domain.validation.a> list, c cVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f281440q = list;
            this.f281441r = cVar;
            this.f281442s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f281440q, this.f281441r, this.f281442s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.C42729a0.b(r10)
                java.util.List<com.avito.android.short_term_rent.bookingform.domain.validation.a> r10 = r9.f281440q
                java.util.Iterator r10 = r10.iterator()
            Lc:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto La6
                java.lang.Object r0 = r10.next()
                com.avito.android.short_term_rent.bookingform.domain.validation.a r0 = (com.avito.android.short_term_rent.bookingform.domain.validation.a) r0
                com.avito.android.short_term_rent.bookingform.domain.validation.c r1 = r9.f281441r
                r1.getClass()
                boolean r1 = r0 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.a.e
                java.lang.String r2 = r9.f281442s
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L30
                if (r2 == 0) goto L94
                boolean r1 = kotlin.text.C43066x.K(r2)
                if (r1 == 0) goto L2e
                goto L94
            L2e:
                r3 = r4
                goto L94
            L30:
                boolean r1 = r0 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.a.c
                if (r1 == 0) goto L45
                if (r2 == 0) goto L94
                int r1 = r2.length()
                long r1 = (long) r1
                r5 = r0
                com.avito.android.short_term_rent.bookingform.domain.validation.a$c r5 = (com.avito.android.short_term_rent.bookingform.domain.validation.a.c) r5
                long r5 = r5.f281432a
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 < 0) goto L94
                goto L2e
            L45:
                boolean r1 = r0 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.a.b
                if (r1 == 0) goto L5a
                if (r2 == 0) goto L94
                int r1 = r2.length()
                long r1 = (long) r1
                r5 = r0
                com.avito.android.short_term_rent.bookingform.domain.validation.a$b r5 = (com.avito.android.short_term_rent.bookingform.domain.validation.a.b) r5
                long r5 = r5.f281430a
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 > 0) goto L94
                goto L2e
            L5a:
                boolean r1 = r0 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.a.C8384a
                if (r1 == 0) goto L7a
                if (r2 == 0) goto L94
                int r1 = r2.length()
                long r5 = (long) r1
                r1 = r0
                com.avito.android.short_term_rent.bookingform.domain.validation.a$a r1 = (com.avito.android.short_term_rent.bookingform.domain.validation.a.C8384a) r1
                long r7 = r1.f281427a
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 < 0) goto L94
                int r2 = r2.length()
                long r5 = (long) r2
                long r1 = r1.f281428b
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 > 0) goto L94
                goto L2e
            L7a:
                boolean r1 = r0 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.a.d
                if (r1 == 0) goto La0
                r1 = r0
                com.avito.android.short_term_rent.bookingform.domain.validation.a$d r1 = (com.avito.android.short_term_rent.bookingform.domain.validation.a.d) r1
                java.lang.String r1 = r1.f281434a
                r3 = 2
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r3)
                if (r2 != 0) goto L8c
                java.lang.String r2 = ""
            L8c:
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r3 = r1.find()
            L94:
                if (r3 != 0) goto Lc
                com.avito.android.short_term_rent.bookingform.domain.validation.b$a r10 = new com.avito.android.short_term_rent.bookingform.domain.validation.b$a
                java.lang.String r0 = r0.getF281436a()
                r10.<init>(r0)
                return r10
            La0:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            La6:
                com.avito.android.short_term_rent.bookingform.domain.validation.b$b r10 = com.avito.android.short_term_rent.bookingform.domain.validation.b.C8385b.f281438a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.domain.validation.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k R0 r02) {
        this.f281439a = r02;
    }

    @l
    public final Object a(@l String str, @k List<? extends com.avito.android.short_term_rent.bookingform.domain.validation.a> list, @k Continuation<? super b> continuation) {
        return C43259k.g(this.f281439a.c(), new a(list, this, str, null), continuation);
    }
}
