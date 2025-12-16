package fM;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42597a;
import kM.AbstractC42598b;
import kM.AbstractC42600d;
import kM.AbstractC42601e;
import kM.InterfaceC42599c;
import kM.f;
import kM.g;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lM.AbstractC43655b;
import lM.InterfaceC43654a;
import pM.InterfaceC46977a;

/* compiled from: IacProblemInteractorImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfM/a;", "LpM/a;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: fM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40313a implements InterfaceC46977a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC42597a f395843a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC42598b f395844b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42599c f395845c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC42600d f395846d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AbstractC42601e f395847e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f395848f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g f395849g;

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fM.a$a, reason: collision with other inner class name */
    public static final class C11145a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((IacProblem) t12).ordinal()), Integer.valueOf(((IacProblem) t13).ordinal()));
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fM.a$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((IacProblem) t12).ordinal()), Integer.valueOf(((IacProblem) t13).ordinal()));
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fM.a$c */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((IacProblem) t12).ordinal()), Integer.valueOf(((IacProblem) t13).ordinal()));
        }
    }

    @Inject
    public C40313a(@k AbstractC42597a abstractC42597a, @k AbstractC42598b abstractC42598b, @k InterfaceC42599c interfaceC42599c, @k AbstractC42600d abstractC42600d, @k AbstractC42601e abstractC42601e, @k f fVar, @k g gVar) {
        this.f395843a = abstractC42597a;
        this.f395844b = abstractC42598b;
        this.f395845c = interfaceC42599c;
        this.f395846d = abstractC42600d;
        this.f395847e = abstractC42601e;
        this.f395848f = fVar;
        this.f395849g = gVar;
    }

    @Override // pM.InterfaceC46977a
    @k
    public final List<IacProblem> a() {
        List listU = C42745f0.U(this.f395843a, this.f395847e, this.f395848f, this.f395849g);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            IacProblem iacProblemB = ((AbstractC43655b) it.next()).b();
            if (iacProblemB != null) {
                arrayList.add(iacProblemB);
            }
        }
        return C42745f0.B0(arrayList, new C11145a());
    }

    @Override // pM.InterfaceC46977a
    @k
    public final List<IacProblem> b() {
        List listU = C42745f0.U(this.f395843a, this.f395845c, this.f395846d, this.f395848f, this.f395849g);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            IacProblem iacProblemA = ((InterfaceC43654a) it.next()).a();
            if (iacProblemA != null) {
                arrayList.add(iacProblemA);
            }
        }
        List<IacProblem> listB0 = C42745f0.B0(arrayList, new b());
        V2.f318762a.c("IacProblemInteractor", "iacProblems: " + listB0, null);
        return listB0;
    }

    @Override // pM.InterfaceC46977a
    @k
    public final List<IacProblem> c() {
        List listU = C42745f0.U(this.f395843a, this.f395844b, this.f395845c, this.f395846d, this.f395847e, this.f395848f, this.f395849g);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            IacProblem iacProblemA = ((InterfaceC43654a) it.next()).a();
            if (iacProblemA != null) {
                arrayList.add(iacProblemA);
            }
        }
        return C42745f0.B0(arrayList, new c());
    }
}
