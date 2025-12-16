package com.avito.beduin.v2.component.box.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.component.box.state.b;
import com.avito.beduin.v2.component.box.state.f;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BoxComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/box/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/box/state/b;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36347d<com.avito.beduin.v2.component.box.state.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f335556b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f335557c = "Box";

    /* compiled from: BoxComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.box.compose.a$a, reason: collision with other inner class name */
    public static final class C10386a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f335558l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10386a(Y41.a<G0> aVar) {
            super(0);
            this.f335558l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f335558l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: BoxComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "params", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<m, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20644z f335559l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b.a.C10388a f335560m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f335561n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f335562o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f335563p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20644z c20644z, b.a.C10388a c10388a, boolean z12, boolean z13, boolean z14) {
            super(1);
            this.f335559l = c20644z;
            this.f335560m = c10388a;
            this.f335561n = z12;
            this.f335562o = z13;
            this.f335563p = z14;
        }

        @Override // Y41.l
        public final n invoke(m mVar) {
            m mVar2 = mVar;
            boolean z12 = this.f335561n || this.f335562o || this.f335563p;
            return com.avito.beduin.v2.component.box.compose.b.a(this.f335559l, this.f335560m, mVar2.f338088a, mVar2.f338089b, z12);
        }
    }

    /* compiled from: BoxComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f335565m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335566n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335567o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f335565m = lVar;
            this.f335566n = interfaceC36249i;
            this.f335567o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            num.intValue();
            int iA2 = C22066f2.a(this.f335567o | 1);
            l<m, n> lVar = this.f335565m;
            InterfaceC36249i interfaceC36249i = this.f335566n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(f.f335586c);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v31 ??, still in use, count: 1, list:
          (r10v31 ?? I:java.lang.Object) from 0x027b: INVOKE (r3v1 ?? I:androidx.compose.runtime.B), (r10v31 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:636)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v31 ??, still in use, count: 1, list:
          (r10v31 ?? I:java.lang.Object) from 0x027b: INVOKE (r3v1 ?? I:androidx.compose.runtime.B), (r10v31 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:636)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f335557c;
    }
}
