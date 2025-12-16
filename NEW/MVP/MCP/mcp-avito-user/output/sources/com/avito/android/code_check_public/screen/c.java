package com.avito.android.code_check_public.screen;

import To.InterfaceC15383a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import java.io.Serializable;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: CodeConfirm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/screen/c;", "Lcom/avito/android/code_check_public/screen/h;", "a", "b", "c", "d", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f119333a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f119334b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Phone, G0> f119335c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f119336d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f119337e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d.b f119338f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC43160i<InterfaceC15383a> f119339g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final p<C43501a, Continuation<? super InterfaceC15383a>, Object> f119340h;

    /* compiled from: CodeConfirm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f119341a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final j f119342b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final d f119343c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f119344d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.c<Integer> f119345e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PrintableText f119346f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final PrintableText f119347g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final PrintableText f119348h;

        public a() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f119341a, aVar.f119341a) && L.f(this.f119342b, aVar.f119342b) && L.f(this.f119343c, aVar.f119343c) && L.f(this.f119344d, aVar.f119344d) && L.f(this.f119345e, aVar.f119345e) && L.f(this.f119346f, aVar.f119346f) && L.f(this.f119347g, aVar.f119347g) && L.f(this.f119348h, aVar.f119348h);
        }

        public final int hashCode() {
            int iHashCode = this.f119341a.hashCode() * 31;
            j jVar = this.f119342b;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            d dVar = this.f119343c;
            return this.f119348h.hashCode() + com.avito.android.actions_sheet.a.f(this.f119347g, com.avito.android.actions_sheet.a.f(this.f119346f, (this.f119345e.hashCode() + com.avito.android.actions_sheet.a.f(this.f119344d, (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31)) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CodeConfirmContent(title=");
            sb2.append(this.f119341a);
            sb2.append(", legal=");
            sb2.append(this.f119342b);
            sb2.append(", subtitle=");
            sb2.append(this.f119343c);
            sb2.append(", inputHint=");
            sb2.append(this.f119344d);
            sb2.append(", inputMarginTopPixels=");
            sb2.append(this.f119345e);
            sb2.append(", requestButtonTextAvailable=");
            sb2.append(this.f119346f);
            sb2.append(", requestButtonTextTimer=");
            sb2.append(this.f119347g);
            sb2.append(", confirmButtonText=");
            return AK.c.m(sb2, this.f119348h, ')');
        }

        public a(PrintableText printableText, j jVar, d dVar, PrintableText printableText2, com.avito.android.code_check_public.c cVar, PrintableText printableText3, PrintableText printableText4, PrintableText printableText5, int i12, C42822w c42822w) {
            printableText = (i12 & 1) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_code_title, new Serializable[0]) : printableText;
            jVar = (i12 & 2) != 0 ? null : jVar;
            dVar = (i12 & 4) != 0 ? new d.b(com.avito.android.printable_text.b.c(R.string.code_check_code_subtitle, new Serializable[0]), new com.avito.android.bxcontent.mvi.entity.f(6)) : dVar;
            printableText2 = (i12 & 8) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_code_hint, new Serializable[0]) : printableText2;
            cVar = (i12 & 16) != 0 ? new com.avito.android.bxcontent.mvi.entity.f(7) : cVar;
            printableText3 = (i12 & 32) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_code_resend, new Serializable[0]) : printableText3;
            printableText4 = (i12 & 64) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_code_resend_timer, new Serializable[0]) : printableText4;
            printableText5 = (i12 & 128) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_code_action, new Serializable[0]) : printableText5;
            this.f119341a = printableText;
            this.f119342b = jVar;
            this.f119343c = dVar;
            this.f119344d = printableText2;
            this.f119345e = cVar;
            this.f119346f = printableText3;
            this.f119347g = printableText4;
            this.f119348h = printableText5;
        }
    }

    /* compiled from: CodeConfirm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$b;", "", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "it", "LTo/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check_public.screen.CodeConfirm$CodeConfirmInteractor$mapToCodeConfirmResult$2", f = "CodeConfirm.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<Object, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f119349q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f119350r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f119351s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<Object, ? super Continuation<? super InterfaceC15383a>, ? extends Object> pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119351s = (SuspendLambda) pVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f119351s, continuation);
                aVar.f119350r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super InterfaceC15383a> continuation) {
                return ((a) create(obj, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f119349q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    Object obj2 = this.f119350r;
                    this.f119349q = 1;
                    obj = this.f119351s.invoke(obj2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "LTo/a;", "<anonymous>", "(Ljava/lang/String;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check_public.screen.CodeConfirm$CodeConfirmInteractor$mapToCodeConfirmResult$3", f = "CodeConfirm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.code_check_public.screen.c$b$b, reason: collision with other inner class name */
        public static final class C3502b extends SuspendLambda implements p<String, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f119352q;

            public C3502b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C3502b c3502b = new C3502b(2, continuation);
                c3502b.f119352q = obj;
                return c3502b;
            }

            @Override // Y41.p
            public final Object invoke(String str, Continuation<? super InterfaceC15383a> continuation) {
                return ((C3502b) create(str, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return new InterfaceC15383a.c(com.avito.android.printable_text.b.f((String) this.f119352q), null, null, 6, null);
            }
        }

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "", "it", "LTo/a;", "<anonymous>", "(Ljava/util/Map;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check_public.screen.CodeConfirm$CodeConfirmInteractor$mapToCodeConfirmResult$4", f = "CodeConfirm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.code_check_public.screen.c$b$c, reason: collision with other inner class name */
        public static final class C3503c extends SuspendLambda implements p<Map<String, ? extends String>, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f119353q;

            public C3503c() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C3503c c3503c = new C3503c(2, continuation);
                c3503c.f119353q = obj;
                return c3503c;
            }

            @Override // Y41.p
            public final Object invoke(Map<String, ? extends String> map, Continuation<? super InterfaceC15383a> continuation) {
                return ((C3503c) create(map, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                String str = (String) C42745f0.F(((Map) this.f119353q).values());
                return str == null ? new InterfaceC15383a.c(com.avito.android.code_check_public.k.a(), null, null, 6, null) : new InterfaceC15383a.d.b(com.avito.android.printable_text.b.f(str));
            }
        }

        @l
        public static Object b(@k TypedResult typedResult, @k p pVar, @k Continuation continuation) {
            return z.s(typedResult, new a(pVar, null), new C3502b(2, null), new C3503c(2, null), com.avito.android.code_check_public.k.a(), continuation, 24);
        }

        @k
        public abstract InterfaceC43160i<InterfaceC15383a> a(@k String str, @l String str2);
    }

    /* compiled from: CodeConfirm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$c;", "", "<init>", "()V", "", "TIMER_PLACEHOLDER", "Ljava/lang/String;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.code_check_public.screen.c$c, reason: collision with other inner class name */
    public static final class C3504c {
        public /* synthetic */ C3504c(C42822w c42822w) {
            this();
        }

        public C3504c() {
        }
    }

    static {
        new C3504c(null);
    }

    public c() {
        throw null;
    }

    public c(String str, i iVar, Y41.l lVar, a aVar, b bVar, d.b bVar2, InterfaceC43160i interfaceC43160i, p pVar, int i12, C42822w c42822w) {
        i iVar2 = (i12 & 2) != 0 ? new i(null, null, null, null, 15, null) : iVar;
        Y41.l lVar2 = (i12 & 4) != 0 ? null : lVar;
        a aVar2 = (i12 & 8) != 0 ? new a(null, null, null, null, null, null, null, null, 255, null) : aVar;
        InterfaceC43160i interfaceC43160iW = (i12 & 64) != 0 ? C43175k.w() : interfaceC43160i;
        p pVar2 = (i12 & 128) == 0 ? pVar : null;
        this.f119333a = str;
        this.f119334b = iVar2;
        this.f119335c = lVar2;
        this.f119336d = aVar2;
        this.f119337e = bVar;
        this.f119338f = bVar2;
        this.f119339g = interfaceC43160iW;
        this.f119340h = pVar2;
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: U, reason: from getter */
    public final i getF119334b() {
        return this.f119334b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f119333a, cVar.f119333a) && L.f(this.f119334b, cVar.f119334b) && L.f(this.f119335c, cVar.f119335c) && L.f(this.f119336d, cVar.f119336d) && L.f(this.f119337e, cVar.f119337e) && L.f(this.f119338f, cVar.f119338f) && L.f(this.f119339g, cVar.f119339g) && L.f(this.f119340h, cVar.f119340h);
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF119333a() {
        return this.f119333a;
    }

    public final int hashCode() {
        int iHashCode = (this.f119334b.hashCode() + (this.f119333a.hashCode() * 31)) * 31;
        Y41.l<Phone, G0> lVar = this.f119335c;
        int iHashCode2 = (this.f119339g.hashCode() + ((this.f119338f.hashCode() + ((this.f119337e.hashCode() + ((this.f119336d.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        p<C43501a, Continuation<? super InterfaceC15383a>, Object> pVar = this.f119340h;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CodeConfirm(name=" + this.f119333a + ", navigation=" + this.f119334b + ", opener=" + this.f119335c + ", content=" + this.f119336d + ", interactor=" + this.f119337e + ", resendInteractor=" + this.f119338f + ", resultFlow=" + this.f119339g + ", deeplinkResultMapper=" + this.f119340h + ')';
    }

    /* compiled from: CodeConfirm.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d;", "", "a", "b", "c", "Lcom/avito/android/code_check_public/screen/c$d$a;", "Lcom/avito/android/code_check_public/screen/c$d$b;", "Lcom/avito/android/code_check_public/screen/c$d$c;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d$a;", "Lcom/avito/android/code_check_public/screen/c$d;", "a", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final InterfaceC3505a f119354a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final com.avito.android.code_check_public.c<Integer> f119355b;

            /* compiled from: CodeConfirm.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d$a$a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check_public.screen.c$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC3505a {
                @k
                com.avito.android.code_check_public.c a();
            }

            public a() {
                throw null;
            }

            public a(InterfaceC3505a interfaceC3505a, com.avito.android.code_check_public.c cVar, int i12, C42822w c42822w) {
                cVar = (i12 & 2) != 0 ? null : cVar;
                this.f119354a = interfaceC3505a;
                this.f119355b = cVar;
            }

            @Override // com.avito.android.code_check_public.screen.c.d
            @l
            public final com.avito.android.code_check_public.c<Integer> a() {
                return this.f119355b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f119354a, aVar.f119354a) && L.f(this.f119355b, aVar.f119355b);
            }

            public final int hashCode() {
                int iHashCode = this.f119354a.hashCode() * 31;
                com.avito.android.code_check_public.c<Integer> cVar = this.f119355b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @k
            public final String toString() {
                return "Formatter(formatter=" + this.f119354a + ", marginTopPixels=" + this.f119355b + ')';
            }
        }

        @l
        com.avito.android.code_check_public.c<Integer> a();

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d$b;", "Lcom/avito/android/code_check_public/screen/c$d;", "a", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f119356a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final com.avito.android.code_check_public.c<Integer> f119357b;

            /* compiled from: CodeConfirm.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d$b$a;", "", "<init>", "()V", "", "PHONE_PLACEHOLDER", "Ljava/lang/String;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            static {
                new a(null);
            }

            public b(@k PrintableText printableText, @l com.avito.android.code_check_public.c<Integer> cVar) {
                this.f119356a = printableText;
                this.f119357b = cVar;
            }

            @Override // com.avito.android.code_check_public.screen.c.d
            @l
            public final com.avito.android.code_check_public.c<Integer> a() {
                return this.f119357b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f119356a, bVar.f119356a) && L.f(this.f119357b, bVar.f119357b);
            }

            public final int hashCode() {
                int iHashCode = this.f119356a.hashCode() * 31;
                com.avito.android.code_check_public.c<Integer> cVar = this.f119357b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @k
            public final String toString() {
                return "TextWithPhone(text=" + this.f119356a + ", marginTopPixels=" + this.f119357b + ')';
            }

            public /* synthetic */ b(PrintableText printableText, com.avito.android.code_check_public.c cVar, int i12, C42822w c42822w) {
                this(printableText, (i12 & 2) != 0 ? null : cVar);
            }
        }

        /* compiled from: CodeConfirm.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/c$d$c;", "Lcom/avito/android/code_check_public/screen/c$d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.screen.c$d$c, reason: collision with other inner class name */
        public static final /* data */ class C3506c implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f119358a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final com.avito.android.code_check_public.c<Integer> f119359b;

            public C3506c(@k PrintableText printableText, @l com.avito.android.code_check_public.c<Integer> cVar) {
                this.f119358a = printableText;
                this.f119359b = cVar;
            }

            @Override // com.avito.android.code_check_public.screen.c.d
            @l
            public final com.avito.android.code_check_public.c<Integer> a() {
                return this.f119359b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3506c)) {
                    return false;
                }
                C3506c c3506c = (C3506c) obj;
                return L.f(this.f119358a, c3506c.f119358a) && L.f(this.f119359b, c3506c.f119359b);
            }

            public final int hashCode() {
                int iHashCode = this.f119358a.hashCode() * 31;
                com.avito.android.code_check_public.c<Integer> cVar = this.f119359b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @k
            public final String toString() {
                return "TextWithoutPhone(text=" + this.f119358a + ", marginTopPixels=" + this.f119359b + ')';
            }

            public /* synthetic */ C3506c(PrintableText printableText, com.avito.android.code_check_public.c cVar, int i12, C42822w c42822w) {
                this(printableText, (i12 & 2) != 0 ? null : cVar);
            }
        }
    }
}
