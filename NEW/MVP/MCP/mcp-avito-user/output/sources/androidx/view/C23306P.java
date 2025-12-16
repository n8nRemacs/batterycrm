package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.core.app.Q;
import androidx.view.AbstractC23301M0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23324b0.b;
import j.D;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;

/* compiled from: NavDeepLinkBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/P;", "", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23306P {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f52854a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Intent f52855b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C23324b0 f52856c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f52857d;

    /* compiled from: NavDeepLinkBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/P$a;", "", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.P$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f52858a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f52859b;

        public a(int i12, @l Bundle bundle) {
            this.f52858a = i12;
            this.f52859b = bundle;
        }
    }

    /* compiled from: NavDeepLinkBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/P$b;", "Landroidx/navigation/N0;", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.P$b */
    public static final class b extends C23303N0 {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final a f52860d = new a();

        /* compiled from: NavDeepLinkBuilder.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/P$b$a", "Landroidx/navigation/M0;", "Landroidx/navigation/W;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.navigation.P$b$a */
        public static final class a extends AbstractC23301M0<C23317W> {
            @Override // androidx.view.AbstractC23301M0
            @k
            public final C23317W a() {
                return new C23317W("permissive");
            }

            @Override // androidx.view.AbstractC23301M0
            @l
            public final C23317W c(@k C23317W c23317w, @l Bundle bundle, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.view.AbstractC23301M0
            public final boolean j() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            a(new C23366f0(this));
        }

        @Override // androidx.view.C23303N0
        @k
        public final <T extends AbstractC23301M0<? extends C23317W>> T b(@k String str) {
            try {
                return (T) super.b(str);
            } catch (IllegalStateException unused) {
                return this.f52860d;
            }
        }
    }

    public C23306P(@k C23397v c23397v) {
        Intent launchIntentForPackage;
        Context context = c23397v.f53205a;
        this.f52854a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f52855b = launchIntentForPackage;
        this.f52857d = new ArrayList();
        C23324b0 c23324b0 = c23397v.f53207c;
        if (c23324b0 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        this.f52856c = c23324b0;
    }

    @k
    public final Q a() {
        C23324b0 c23324b0 = this.f52856c;
        if (c23324b0 == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.f52857d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        C23317W c23317w = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.f52854a;
            int i12 = 0;
            if (!zHasNext) {
                int[] iArrL0 = C42745f0.L0(arrayList2);
                Intent intent = this.f52855b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrL0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                Q q12 = new Q(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(q12.f44514c.getPackageManager());
                }
                if (component != null) {
                    q12.a(component);
                }
                ArrayList<Intent> arrayList4 = q12.f44513b;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i12 < size) {
                    Intent intent3 = arrayList4.get(i12);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i12++;
                }
                return q12;
            }
            a aVar = (a) it.next();
            int i13 = aVar.f52858a;
            C23317W c23317wB = b(i13);
            if (c23317wB == null) {
                C23317W.f52878k.getClass();
                throw new IllegalArgumentException("Navigation destination " + C23317W.b.b(i13, context) + " cannot be found in the navigation graph " + c23324b0);
            }
            int[] iArrD = c23317wB.d(c23317w);
            int length = iArrD.length;
            while (i12 < length) {
                arrayList2.add(Integer.valueOf(iArrD[i12]));
                arrayList3.add(aVar.f52859b);
                i12++;
            }
            c23317w = c23317wB;
        }
    }

    public final C23317W b(@D int i12) {
        C42754k c42754k = new C42754k();
        c42754k.addLast(this.f52856c);
        while (!c42754k.isEmpty()) {
            C23317W c23317w = (C23317W) c42754k.removeFirst();
            if (c23317w.f52886i == i12) {
                return c23317w;
            }
            if (c23317w instanceof C23324b0) {
                C23324b0.b bVar = ((C23324b0) c23317w).new b();
                while (bVar.hasNext()) {
                    c42754k.addLast((C23317W) bVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f52857d.iterator();
        while (it.hasNext()) {
            int i12 = ((a) it.next()).f52858a;
            if (b(i12) == null) {
                C23317W.f52878k.getClass();
                StringBuilder sbA = r.A("Navigation destination ", C23317W.b.b(i12, this.f52854a), " cannot be found in the navigation graph ");
                sbA.append(this.f52856c);
                throw new IllegalArgumentException(sbA.toString());
            }
        }
    }
}
