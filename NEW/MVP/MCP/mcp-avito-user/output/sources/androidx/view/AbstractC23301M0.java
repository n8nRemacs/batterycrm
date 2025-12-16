package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.C23317W;
import j.InterfaceC42153i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: Navigator.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/navigation/M0;", "Landroidx/navigation/W;", "D", "", "<init>", "()V", "a", "b", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.M0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23301M0<D extends C23317W> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public AbstractC23307P0 f52807a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52808b;

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/M0$a;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.M0$a */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/M0$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @P41.d
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    /* renamed from: androidx.navigation.M0$b */
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/W;", "D", "Landroidx/navigation/u;", "backStackEntry", "invoke", "(Landroidx/navigation/u;)Landroidx/navigation/u;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.M0$c */
    public static final class c extends N implements Y41.l<C23395u, C23395u> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC23301M0<D> f52809l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23280B0 f52810m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f52811n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC23301M0<D> abstractC23301M0, C23280B0 c23280b0, a aVar) {
            super(1);
            this.f52809l = abstractC23301M0;
            this.f52810m = c23280b0;
            this.f52811n = aVar;
        }

        @Override // Y41.l
        public final C23395u invoke(C23395u c23395u) {
            C23395u c23395uA = c23395u;
            C23317W c23317w = c23395uA.f53182c;
            if (c23317w == null) {
                c23317w = null;
            }
            if (c23317w == null) {
                return null;
            }
            Bundle bundleA = c23395uA.a();
            AbstractC23301M0<D> abstractC23301M0 = this.f52809l;
            C23317W c23317wC = abstractC23301M0.c(c23317w, bundleA, this.f52810m, this.f52811n);
            if (c23317wC == null) {
                c23395uA = null;
            } else if (!c23317wC.equals(c23317w)) {
                c23395uA = abstractC23301M0.b().a(c23317wC, c23317wC.b(c23395uA.a()));
            }
            return c23395uA;
        }
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/W;", "D", "Landroidx/navigation/E0;", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/E0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.M0$d */
    public static final class d extends N implements Y41.l<C23286E0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f52812l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C23286E0 c23286e0) {
            c23286e0.f52770b = true;
            return G0.f406611a;
        }
    }

    @k
    public abstract D a();

    @k
    public final AbstractC23307P0 b() {
        AbstractC23307P0 abstractC23307P0 = this.f52807a;
        if (abstractC23307P0 != null) {
            return abstractC23307P0;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l a aVar) {
        C43025h.a aVar2 = new C43025h.a(C43033p.m(new o0(new C42770s0(list), new c(this, c23280b0, aVar))));
        while (aVar2.hasNext()) {
            b().g((C23395u) aVar2.next());
        }
    }

    @InterfaceC42153i
    public void e(@k AbstractC23307P0 abstractC23307P0) {
        this.f52807a = abstractC23307P0;
        this.f52808b = true;
    }

    public void f(@k C23395u c23395u) {
        C23317W c23317w = c23395u.f53182c;
        if (c23317w == null) {
            c23317w = null;
        }
        if (c23317w == null) {
            return;
        }
        c(c23317w, null, C23288F0.a(d.f52812l), null);
        b().c(c23395u);
    }

    @l
    public Bundle h() {
        return null;
    }

    public void i(@k C23395u c23395u, boolean z12) {
        List<C23395u> value = b().f52865e.getValue();
        if (!value.contains(c23395u)) {
            throw new IllegalStateException(("popBackStack was called with " + c23395u + " which does not exist in back stack " + value).toString());
        }
        ListIterator<C23395u> listIterator = value.listIterator(value.size());
        C23395u c23395uPrevious = null;
        while (j()) {
            c23395uPrevious = listIterator.previous();
            if (L.f(c23395uPrevious, c23395u)) {
                break;
            }
        }
        if (c23395uPrevious != null) {
            b().d(c23395uPrevious, z12);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(@k Bundle bundle) {
    }

    @l
    public C23317W c(@k D d12, @l Bundle bundle, @l C23280B0 c23280b0, @l a aVar) {
        return d12;
    }
}
