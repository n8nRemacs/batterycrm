package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.Z0;
import androidx.core.util.InterfaceC22791e;
import androidx.core.view.InterfaceC22842v;
import androidx.fragment.app.C22962u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.C23485c;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.result.ActivityResult;
import androidx.view.result.IntentSenderRequest;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import i.AbstractC41201a;
import i.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager implements D {

    /* renamed from: B, reason: collision with root package name */
    public androidx.view.result.h<Intent> f46349B;

    /* renamed from: C, reason: collision with root package name */
    public androidx.view.result.h<IntentSenderRequest> f46350C;

    /* renamed from: D, reason: collision with root package name */
    public androidx.view.result.h<String[]> f46351D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f46353F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f46354G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f46355H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f46356I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f46357J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList<C22943a> f46358K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList<Boolean> f46359L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList<Fragment> f46360M;

    /* renamed from: N, reason: collision with root package name */
    public C22967z f46361N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46364b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<C22943a> f46366d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f46367e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.view.y f46369g;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<p> f46375m;

    /* renamed from: p, reason: collision with root package name */
    public final C22963v f46378p;

    /* renamed from: q, reason: collision with root package name */
    public final C22963v f46379q;

    /* renamed from: r, reason: collision with root package name */
    public final C22963v f46380r;

    /* renamed from: s, reason: collision with root package name */
    public final C22963v f46381s;

    /* renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.r<?> f46384v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC22957o f46385w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f46386x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public Fragment f46387y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<q> f46363a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final G f46365c = new G();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C22961t f46368f = new LayoutInflaterFactory2C22961t(this);

    /* renamed from: h, reason: collision with root package name */
    public final androidx.view.x f46370h = new b();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f46371i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, BackStackState> f46372j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f46373k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, o> f46374l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final C22962u f46376n = new C22962u(this);

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList<A> f46377o = new CopyOnWriteArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    public final androidx.core.view.C f46382t = new c();

    /* renamed from: u, reason: collision with root package name */
    public int f46383u = -1;

    /* renamed from: z, reason: collision with root package name */
    public final C22959q f46388z = new d();

    /* renamed from: A, reason: collision with root package name */
    public final e f46348A = new e();

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f46352E = new ArrayDeque<>();

    /* renamed from: O, reason: collision with root package name */
    public final Runnable f46362O = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public String f46389b;

        /* renamed from: c, reason: collision with root package name */
        public int f46390c;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.f46389b = parcel.readString();
                launchedFragmentInfo.f46390c = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i12) {
                return new LaunchedFragmentInfo[i12];
            }
        }

        public LaunchedFragmentInfo(@j.N String str, int i12) {
            this.f46389b = str;
            this.f46390c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeString(this.f46389b);
            parcel.writeInt(this.f46390c);
        }
    }

    public class a implements androidx.view.result.a<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.view.result.a
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                iArr[i12] = ((Boolean) arrayList.get(i12)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f46352E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            Fragment fragmentC = fragmentManager.f46365c.c(launchedFragmentInfoPollFirst.f46389b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onRequestPermissionsResult(launchedFragmentInfoPollFirst.f46390c, strArr, iArr);
        }
    }

    public class b extends androidx.view.x {
        public b() {
            super(false);
        }

        @Override // androidx.view.x
        public final void c() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.B(true);
            if (fragmentManager.f46370h.f21286a) {
                fragmentManager.b0(-1, 0, null);
            } else {
                fragmentManager.f46369g.c();
            }
        }
    }

    public class c implements androidx.core.view.C {
        public c() {
        }

        @Override // androidx.core.view.C
        public final void a(@j.N Menu menu) {
            FragmentManager.this.s(menu);
        }

        @Override // androidx.core.view.C
        public final void b(@j.N Menu menu, @j.N MenuInflater menuInflater) {
            FragmentManager.this.m(menu, menuInflater);
        }

        @Override // androidx.core.view.C
        public final void c(@j.N Menu menu) {
            FragmentManager.this.v(menu);
        }

        @Override // androidx.core.view.C
        public final boolean d(@j.N MenuItem menuItem) {
            return FragmentManager.this.r(menuItem);
        }
    }

    public class d extends C22959q {
        public d() {
        }

        @Override // androidx.fragment.app.C22959q
        @j.N
        public final Fragment b(@j.N ClassLoader classLoader, @j.N String str) {
            return Fragment.instantiate(FragmentManager.this.f46384v.f46584c, str, null);
        }
    }

    public class e implements n0 {
        @Override // androidx.fragment.app.n0
        @j.N
        public final C22949g a(@j.N ViewGroup viewGroup) {
            return new C22949g(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.B(true);
        }
    }

    public class g implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f46396b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C f46397c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f46398d;

        public g(String str, C c12, Lifecycle lifecycle) {
            this.f46396b = str;
            this.f46397c = c12;
            this.f46398d = lifecycle;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@j.N InterfaceC22983P interfaceC22983P, @j.N Lifecycle.Event event) {
            Bundle bundle;
            Lifecycle.Event event2 = Lifecycle.Event.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f46396b;
            if (event == event2 && (bundle = fragmentManager.f46373k.get(str)) != null) {
                this.f46397c.k(bundle, str);
                fragmentManager.f46373k.remove(str);
                Log.isLoggable("FragmentManager", 2);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f46398d.c(this);
                fragmentManager.f46374l.remove(str);
            }
        }
    }

    public class h implements A {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46400b;

        public h(Fragment fragment) {
            this.f46400b = fragment;
        }

        @Override // androidx.fragment.app.A
        public final void a(@j.N Fragment fragment) {
            this.f46400b.onAttachFragment(fragment);
        }
    }

    public class i implements androidx.view.result.a<ActivityResult> {
        public i() {
        }

        @Override // androidx.view.result.a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollLast = fragmentManager.f46352E.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                toString();
                return;
            }
            Fragment fragmentC = fragmentManager.f46365c.c(launchedFragmentInfoPollLast.f46389b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(launchedFragmentInfoPollLast.f46390c, activityResult2.f21242b, activityResult2.f21243c);
        }
    }

    public class j implements androidx.view.result.a<ActivityResult> {
        public j() {
        }

        @Override // androidx.view.result.a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f46352E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            Fragment fragmentC = fragmentManager.f46365c.c(launchedFragmentInfoPollFirst.f46389b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(launchedFragmentInfoPollFirst.f46390c, activityResult2.f21242b, activityResult2.f21243c);
        }
    }

    public interface k {
        int getId();

        @j.P
        String getName();
    }

    public class l implements q {
        @Override // androidx.fragment.app.FragmentManager.q
        public final boolean a(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2) {
            throw null;
        }
    }

    public static class m extends AbstractC41201a<IntentSenderRequest, ActivityResult> {
        @Override // i.AbstractC41201a
        @j.N
        public final Intent createIntent(@j.N Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f21245c;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest2.f21244b;
                    IntentSenderRequest.a aVar = new IntentSenderRequest.a(intentSender);
                    aVar.f21248a = null;
                    aVar.f21250c = intentSenderRequest2.f21247e;
                    aVar.f21249b = intentSenderRequest2.f21246d;
                    intentSenderRequest2 = new IntentSenderRequest(intentSender, aVar.f21248a, aVar.f21249b, aVar.f21250c);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (Log.isLoggable("FragmentManager", 2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // i.AbstractC41201a
        @j.N
        public final ActivityResult parseResult(int i12, @j.P Intent intent) {
            return new ActivityResult(i12, intent);
        }
    }

    public static class o implements C {

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle f46403b;

        /* renamed from: c, reason: collision with root package name */
        public final C f46404c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC22979L f46405d;

        public o(@j.N Lifecycle lifecycle, @j.N C c12, @j.N InterfaceC22979L interfaceC22979L) {
            this.f46403b = lifecycle;
            this.f46404c = c12;
            this.f46405d = interfaceC22979L;
        }

        @Override // androidx.fragment.app.C
        public final void k(@j.N Bundle bundle, @j.N String str) {
            this.f46404c.k(bundle, str);
        }
    }

    public interface q {
        boolean a(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2);
    }

    public class r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final String f46406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46407b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46408c;

        public r(@j.P String str, int i12, int i13) {
            this.f46406a = str;
            this.f46407b = i12;
            this.f46408c = i13;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public final boolean a(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f46387y;
            if (fragment == null || this.f46407b >= 0 || this.f46406a != null || !fragment.getChildFragmentManager().b0(-1, 0, null)) {
                return FragmentManager.this.c0(arrayList, arrayList2, this.f46406a, this.f46407b, this.f46408c);
            }
            return false;
        }
    }

    public class s implements q {

        /* renamed from: a, reason: collision with root package name */
        public final String f46410a;

        public s(@j.N String str) {
            this.f46410a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
        
            r3.add(r6);
         */
        @Override // androidx.fragment.app.FragmentManager.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(@j.N java.util.ArrayList<androidx.fragment.app.C22943a> r13, @j.N java.util.ArrayList<java.lang.Boolean> r14) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.s.a(java.util.ArrayList, java.util.ArrayList):boolean");
        }
    }

    public class t implements q {

        /* renamed from: a, reason: collision with root package name */
        public final String f46412a;

        public t(@j.N String str) {
            this.f46412a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public final boolean a(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2) {
            int i12;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f46412a;
            int iF2 = fragmentManager.F(-1, str, true);
            if (iF2 < 0) {
                return false;
            }
            for (int i13 = iF2; i13 < fragmentManager.f46366d.size(); i13++) {
                C22943a c22943a = fragmentManager.f46366d.get(i13);
                if (!c22943a.f46457p) {
                    fragmentManager.u0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c22943a + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i14 = iF2;
            while (true) {
                int i15 = 2;
                if (i14 >= fragmentManager.f46366d.size()) {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment = (Fragment) arrayDeque.removeFirst();
                        if (fragment.mRetainInstance) {
                            StringBuilder sbA = androidx.appcompat.app.r.A("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbA.append(hashSet.contains(fragment) ? "direct reference to retained " : "retained child ");
                            sbA.append("fragment ");
                            sbA.append(fragment);
                            fragmentManager.u0(new IllegalArgumentException(sbA.toString()));
                            throw null;
                        }
                        Iterator it = fragment.mChildFragmentManager.f46365c.e().iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = (Fragment) it.next();
                            if (fragment2 != null) {
                                arrayDeque.addLast(fragment2);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Fragment) it2.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.f46366d.size() - iF2);
                    for (int i16 = iF2; i16 < fragmentManager.f46366d.size(); i16++) {
                        arrayList4.add(null);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.f46366d.size() - 1; size >= iF2; size--) {
                        C22943a c22943aRemove = fragmentManager.f46366d.remove(size);
                        C22943a c22943a2 = new C22943a(c22943aRemove);
                        ArrayList<H.a> arrayList5 = c22943a2.f46442a;
                        int size2 = arrayList5.size() - 1;
                        while (size2 >= 0) {
                            H.a aVar = arrayList5.get(size2);
                            if (aVar.f46460c) {
                                if (aVar.f46458a == 8) {
                                    aVar.f46460c = false;
                                    arrayList5.remove(size2 - 1);
                                    size2--;
                                } else {
                                    int i17 = aVar.f46459b.mContainerId;
                                    aVar.f46458a = 2;
                                    aVar.f46460c = false;
                                    for (int i18 = size2 - 1; i18 >= 0; i18--) {
                                        H.a aVar2 = arrayList5.get(i18);
                                        if (aVar2.f46460c && aVar2.f46459b.mContainerId == i17) {
                                            arrayList5.remove(i18);
                                            size2--;
                                        }
                                    }
                                }
                            }
                            size2--;
                        }
                        arrayList4.set(size - iF2, new BackStackRecordState(c22943a2));
                        c22943aRemove.f46529t = true;
                        arrayList.add(c22943aRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.f46372j.put(str, backStackState);
                    return true;
                }
                C22943a c22943a3 = fragmentManager.f46366d.get(i14);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                Iterator<H.a> it3 = c22943a3.f46442a.iterator();
                while (it3.hasNext()) {
                    H.a next = it3.next();
                    Fragment fragment3 = next.f46459b;
                    if (fragment3 != null) {
                        if (!next.f46460c || (i12 = next.f46458a) == 1 || i12 == i15 || i12 == 8) {
                            hashSet.add(fragment3);
                            hashSet2.add(fragment3);
                        }
                        int i19 = next.f46458a;
                        if (i19 == 1 || i19 == 2) {
                            hashSet3.add(fragment3);
                        }
                        i15 = 2;
                    }
                }
                hashSet2.removeAll(hashSet3);
                if (!hashSet2.isEmpty()) {
                    StringBuilder sbA2 = androidx.appcompat.app.r.A("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                    sbA2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                    sbA2.append(" in ");
                    sbA2.append(c22943a3);
                    sbA2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                    fragmentManager.u0(new IllegalArgumentException(sbA2.toString()));
                    throw null;
                }
                i14++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.v] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.v] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.v] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.v] */
    public FragmentManager() {
        final int i12 = 0;
        this.f46378p = new InterfaceC22791e(this) { // from class: androidx.fragment.app.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f46608c;

            {
                this.f46608c = this;
            }

            @Override // androidx.core.util.InterfaceC22791e
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f46608c;
                        if (fragmentManager.T()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f46608c;
                        if (fragmentManager2.T() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.u uVar = (androidx.core.app.u) obj;
                        FragmentManager fragmentManager3 = this.f46608c;
                        if (fragmentManager3.T()) {
                            fragmentManager3.p(uVar.f44551a, false);
                            break;
                        }
                        break;
                    default:
                        androidx.core.app.L l12 = (androidx.core.app.L) obj;
                        FragmentManager fragmentManager4 = this.f46608c;
                        if (fragmentManager4.T()) {
                            fragmentManager4.u(l12.f44503a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f46379q = new InterfaceC22791e(this) { // from class: androidx.fragment.app.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f46608c;

            {
                this.f46608c = this;
            }

            @Override // androidx.core.util.InterfaceC22791e
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f46608c;
                        if (fragmentManager.T()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f46608c;
                        if (fragmentManager2.T() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.u uVar = (androidx.core.app.u) obj;
                        FragmentManager fragmentManager3 = this.f46608c;
                        if (fragmentManager3.T()) {
                            fragmentManager3.p(uVar.f44551a, false);
                            break;
                        }
                        break;
                    default:
                        androidx.core.app.L l12 = (androidx.core.app.L) obj;
                        FragmentManager fragmentManager4 = this.f46608c;
                        if (fragmentManager4.T()) {
                            fragmentManager4.u(l12.f44503a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 2;
        this.f46380r = new InterfaceC22791e(this) { // from class: androidx.fragment.app.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f46608c;

            {
                this.f46608c = this;
            }

            @Override // androidx.core.util.InterfaceC22791e
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f46608c;
                        if (fragmentManager.T()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f46608c;
                        if (fragmentManager2.T() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.u uVar = (androidx.core.app.u) obj;
                        FragmentManager fragmentManager3 = this.f46608c;
                        if (fragmentManager3.T()) {
                            fragmentManager3.p(uVar.f44551a, false);
                            break;
                        }
                        break;
                    default:
                        androidx.core.app.L l12 = (androidx.core.app.L) obj;
                        FragmentManager fragmentManager4 = this.f46608c;
                        if (fragmentManager4.T()) {
                            fragmentManager4.u(l12.f44503a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 3;
        this.f46381s = new InterfaceC22791e(this) { // from class: androidx.fragment.app.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f46608c;

            {
                this.f46608c = this;
            }

            @Override // androidx.core.util.InterfaceC22791e
            public final void accept(Object obj) {
                switch (i15) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f46608c;
                        if (fragmentManager.T()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f46608c;
                        if (fragmentManager2.T() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.u uVar = (androidx.core.app.u) obj;
                        FragmentManager fragmentManager3 = this.f46608c;
                        if (fragmentManager3.T()) {
                            fragmentManager3.p(uVar.f44551a, false);
                            break;
                        }
                        break;
                    default:
                        androidx.core.app.L l12 = (androidx.core.app.L) obj;
                        FragmentManager fragmentManager4 = this.f46608c;
                        if (fragmentManager4.T()) {
                            fragmentManager4.u(l12.f44503a, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @j.P
    public static Fragment I(@j.N View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static boolean S(@j.N Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f46365c.e().iterator();
            boolean zS2 = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    zS2 = S(fragment2);
                }
                if (zS2) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean U(@j.P Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f46387y) && U(fragmentManager.f46386x);
    }

    public final void A(boolean z12) {
        if (this.f46364b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f46384v == null) {
            if (!this.f46356I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f46384v.f46585d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z12 && V()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f46358K == null) {
            this.f46358K = new ArrayList<>();
            this.f46359L = new ArrayList<>();
        }
    }

    public final boolean B(boolean z12) {
        boolean zA2;
        A(z12);
        boolean z13 = false;
        while (true) {
            ArrayList<C22943a> arrayList = this.f46358K;
            ArrayList<Boolean> arrayList2 = this.f46359L;
            synchronized (this.f46363a) {
                if (this.f46363a.isEmpty()) {
                    zA2 = false;
                } else {
                    try {
                        int size = this.f46363a.size();
                        zA2 = false;
                        for (int i12 = 0; i12 < size; i12++) {
                            zA2 |= this.f46363a.get(i12).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA2) {
                w0();
                x();
                this.f46365c.f46439b.values().removeAll(Collections.singleton(null));
                return z13;
            }
            z13 = true;
            this.f46364b = true;
            try {
                g0(this.f46358K, this.f46359L);
            } finally {
                f();
            }
        }
    }

    public final void C(@j.N C22943a c22943a, boolean z12) {
        if (z12 && (this.f46384v == null || this.f46356I)) {
            return;
        }
        A(z12);
        c22943a.a(this.f46358K, this.f46359L);
        this.f46364b = true;
        try {
            g0(this.f46358K, this.f46359L);
            f();
            w0();
            x();
            this.f46365c.f46439b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            f();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022a A[PHI: r15
  0x022a: PHI (r15v9 int) = (r15v8 int), (r15v11 int) binds: [B:103:0x0217, B:107:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(@j.N java.util.ArrayList<androidx.fragment.app.C22943a> r24, @j.N java.util.ArrayList<java.lang.Boolean> r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.D(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    @j.K
    public final void E() {
        B(true);
        J();
    }

    public final int F(int i12, @j.P String str, boolean z12) {
        ArrayList<C22943a> arrayList = this.f46366d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i12 < 0) {
            if (z12) {
                return 0;
            }
            return this.f46366d.size() - 1;
        }
        int size = this.f46366d.size() - 1;
        while (size >= 0) {
            C22943a c22943a = this.f46366d.get(size);
            if ((str != null && str.equals(c22943a.f46450i)) || (i12 >= 0 && i12 == c22943a.f46528s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z12) {
            if (size == this.f46366d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C22943a c22943a2 = this.f46366d.get(size - 1);
            if ((str == null || !str.equals(c22943a2.f46450i)) && (i12 < 0 || i12 != c22943a2.f46528s)) {
                return size;
            }
            size--;
        }
        return size;
    }

    @j.P
    public final Fragment G(@j.D int i12) {
        G g12 = this.f46365c;
        ArrayList<Fragment> arrayList = g12.f46438a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i12) {
                return fragment;
            }
        }
        for (E e12 : g12.f46439b.values()) {
            if (e12 != null) {
                Fragment fragment2 = e12.f46294c;
                if (fragment2.mFragmentId == i12) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @j.P
    public final Fragment H(@j.P String str) {
        G g12 = this.f46365c;
        if (str != null) {
            ArrayList<Fragment> arrayList = g12.f46438a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (E e12 : g12.f46439b.values()) {
                if (e12 != null) {
                    Fragment fragment2 = e12.f46294c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            g12.getClass();
        }
        return null;
    }

    public final void J() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f46505e) {
                Log.isLoggable("FragmentManager", 2);
                specialEffectsController.f46505e = false;
                specialEffectsController.c();
            }
        }
    }

    @j.N
    public final k K(int i12) {
        return this.f46366d.get(i12);
    }

    public final int L() {
        ArrayList<C22943a> arrayList = this.f46366d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @j.P
    public final Fragment M(@j.N Bundle bundle, @j.N String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.f46365c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        u0(new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.n("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup N(@j.N Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f46385w.c()) {
            View viewB = this.f46385w.b(fragment.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    @j.N
    public final C22959q O() {
        Fragment fragment = this.f46386x;
        return fragment != null ? fragment.mFragmentManager.O() : this.f46388z;
    }

    @j.N
    public final List<Fragment> P() {
        return this.f46365c.f();
    }

    @j.N
    public final n0 Q() {
        Fragment fragment = this.f46386x;
        return fragment != null ? fragment.mFragmentManager.Q() : this.f46348A;
    }

    public final void R(@j.N Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        s0(fragment);
    }

    public final boolean T() {
        Fragment fragment = this.f46386x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f46386x.getParentFragmentManager().T();
    }

    public final boolean V() {
        return this.f46354G || this.f46355H;
    }

    public final void W(int i12, boolean z12) {
        HashMap<String, E> map;
        androidx.fragment.app.r<?> rVar;
        if (this.f46384v == null && i12 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z12 || i12 != this.f46383u) {
            this.f46383u = i12;
            G g12 = this.f46365c;
            Iterator<Fragment> it = g12.f46438a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = g12.f46439b;
                if (!zHasNext) {
                    break;
                }
                E e12 = map.get(it.next().mWho);
                if (e12 != null) {
                    e12.i();
                }
            }
            for (E e13 : map.values()) {
                if (e13 != null) {
                    e13.i();
                    Fragment fragment = e13.f46294c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !g12.f46440c.containsKey(fragment.mWho)) {
                            g12.i(e13.l(), fragment.mWho);
                        }
                        g12.h(e13);
                    }
                }
            }
            t0();
            if (this.f46353F && (rVar = this.f46384v) != null && this.f46383u == 7) {
                rVar.h();
                this.f46353F = false;
            }
        }
    }

    public final void X() {
        if (this.f46384v == null) {
            return;
        }
        this.f46354G = false;
        this.f46355H = false;
        this.f46361N.f46615N = false;
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void Y() {
        z(new r(null, -1, 0), false);
    }

    public final void Z(int i12, int i13, boolean z12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Bad id: "));
        }
        z(new r(null, i12, i13), z12);
    }

    public final E a(@j.N Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.c(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
        E eI2 = i(fragment);
        fragment.mFragmentManager = this;
        G g12 = this.f46365c;
        g12.g(eI2);
        if (!fragment.mDetached) {
            g12.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (S(fragment)) {
                this.f46353F = true;
            }
        }
        return eI2;
    }

    public final void a0(int i12, @j.P String str) {
        z(new r(str, -1, i12), false);
    }

    public final void b(@j.N p pVar) {
        if (this.f46375m == null) {
            this.f46375m = new ArrayList<>();
        }
        this.f46375m.add(pVar);
    }

    public final boolean b0(int i12, int i13, @j.P String str) {
        B(false);
        A(true);
        Fragment fragment = this.f46387y;
        if (fragment != null && i12 < 0 && str == null && fragment.getChildFragmentManager().b0(-1, 0, null)) {
            return true;
        }
        boolean zC02 = c0(this.f46358K, this.f46359L, str, i12, i13);
        if (zC02) {
            this.f46364b = true;
            try {
                g0(this.f46358K, this.f46359L);
            } finally {
                f();
            }
        }
        w0();
        x();
        this.f46365c.f46439b.values().removeAll(Collections.singleton(null));
        return zC02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void c(@j.N androidx.fragment.app.r<?> rVar, @j.N AbstractC22957o abstractC22957o, @j.P Fragment fragment) {
        if (this.f46384v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f46384v = rVar;
        this.f46385w = abstractC22957o;
        this.f46386x = fragment;
        CopyOnWriteArrayList<A> copyOnWriteArrayList = this.f46377o;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(fragment));
        } else if (rVar instanceof A) {
            copyOnWriteArrayList.add((A) rVar);
        }
        if (this.f46386x != null) {
            w0();
        }
        if (rVar instanceof androidx.view.C) {
            androidx.view.C c12 = (androidx.view.C) rVar;
            androidx.view.y onBackPressedDispatcher = c12.getF21241d();
            this.f46369g = onBackPressedDispatcher;
            InterfaceC22983P interfaceC22983P = c12;
            if (fragment != null) {
                interfaceC22983P = fragment;
            }
            onBackPressedDispatcher.a(interfaceC22983P, this.f46370h);
        }
        if (fragment != null) {
            C22967z c22967z = fragment.mFragmentManager.f46361N;
            HashMap<String, C22967z> map = c22967z.f46611J;
            C22967z c22967z2 = map.get(fragment.mWho);
            if (c22967z2 == null) {
                c22967z2 = new C22967z(c22967z.f46613L);
                map.put(fragment.mWho, c22967z2);
            }
            this.f46361N = c22967z2;
        } else if (rVar instanceof T0) {
            S0 viewModelStore = ((T0) rVar).getF42820b();
            P0.c cVar = C22967z.f46609O;
            this.f46361N = (C22967z) new P0(viewModelStore, C22967z.f46609O).a(C22967z.class);
        } else {
            this.f46361N = new C22967z(false);
        }
        this.f46361N.f46615N = V();
        this.f46365c.f46441d = this.f46361N;
        Object obj = this.f46384v;
        if ((obj instanceof InterfaceC23487e) && fragment == null) {
            C23485c savedStateRegistry = ((InterfaceC23487e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new Z0(this, 2));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                i0(bundleA);
            }
        }
        Object obj2 = this.f46384v;
        if (obj2 instanceof androidx.view.result.k) {
            androidx.view.result.j activityResultRegistry = ((androidx.view.result.k) obj2).getActivityResultRegistry();
            String strF = androidx.camera.camera2.internal.G.f("FragmentManager:", fragment != null ? AK.c.s(new StringBuilder(), fragment.mWho, ":") : "");
            this.f46349B = activityResultRegistry.e(androidx.appcompat.app.r.q(strF, "StartActivityForResult"), new b.m(), new i());
            this.f46350C = activityResultRegistry.e(androidx.appcompat.app.r.q(strF, "StartIntentSenderForResult"), new m(), new j());
            this.f46351D = activityResultRegistry.e(androidx.appcompat.app.r.q(strF, "RequestPermissions"), new b.k(), new a());
        }
        Object obj3 = this.f46384v;
        if (obj3 instanceof androidx.core.content.j) {
            ((androidx.core.content.j) obj3).addOnConfigurationChangedListener(this.f46378p);
        }
        Object obj4 = this.f46384v;
        if (obj4 instanceof androidx.core.content.k) {
            ((androidx.core.content.k) obj4).addOnTrimMemoryListener(this.f46379q);
        }
        Object obj5 = this.f46384v;
        if (obj5 instanceof androidx.core.app.F) {
            ((androidx.core.app.F) obj5).addOnMultiWindowModeChangedListener(this.f46380r);
        }
        Object obj6 = this.f46384v;
        if (obj6 instanceof androidx.core.app.H) {
            ((androidx.core.app.H) obj6).addOnPictureInPictureModeChangedListener(this.f46381s);
        }
        Object obj7 = this.f46384v;
        if ((obj7 instanceof InterfaceC22842v) && fragment == null) {
            ((InterfaceC22842v) obj7).addMenuProvider(this.f46382t);
        }
    }

    public final boolean c0(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2, @j.P String str, int i12, int i13) {
        int iF2 = F(i12, str, (i13 & 1) != 0);
        if (iF2 < 0) {
            return false;
        }
        for (int size = this.f46366d.size() - 1; size >= iF2; size--) {
            arrayList.add(this.f46366d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void d(@j.N Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f46365c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            if (S(fragment)) {
                this.f46353F = true;
            }
        }
    }

    public final void d0(@j.N Bundle bundle, @j.N Fragment fragment, @j.N String str) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            u0(new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    @j.N
    public final H e() {
        return new C22943a(this);
    }

    public final void e0(@j.N n nVar, boolean z12) {
        this.f46376n.f46603a.add(new C22962u.a(nVar, z12));
    }

    public final void f() {
        this.f46364b = false;
        this.f46359L.clear();
        this.f46358K.clear();
    }

    public final void f0(@j.N Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        G g12 = this.f46365c;
        synchronized (g12.f46438a) {
            g12.f46438a.remove(fragment);
        }
        fragment.mAdded = false;
        if (S(fragment)) {
            this.f46353F = true;
        }
        fragment.mRemoving = true;
        s0(fragment);
    }

    public final void g(@j.N String str) {
        o oVarRemove = this.f46374l.remove(str);
        if (oVarRemove != null) {
            oVarRemove.f46403b.c(oVarRemove.f46405d);
        }
        Log.isLoggable("FragmentManager", 2);
    }

    public final void g0(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            if (!arrayList.get(i12).f46457p) {
                if (i13 != i12) {
                    D(arrayList, arrayList2, i13, i12);
                }
                i13 = i12 + 1;
                if (arrayList2.get(i12).booleanValue()) {
                    while (i13 < size && arrayList2.get(i13).booleanValue() && !arrayList.get(i13).f46457p) {
                        i13++;
                    }
                }
                D(arrayList, arrayList2, i12, i13);
                i12 = i13 - 1;
            }
            i12++;
        }
        if (i13 != size) {
            D(arrayList, arrayList2, i13, size);
        }
    }

    public final HashSet h() {
        Object objA;
        HashSet hashSet = new HashSet();
        Iterator it = this.f46365c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((E) it.next()).f46294c.mContainer;
            if (viewGroup != null) {
                n0 n0VarQ = Q();
                SpecialEffectsController.f46500f.getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    objA = (SpecialEffectsController) tag;
                } else {
                    objA = n0VarQ.a(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, objA);
                }
                hashSet.add(objA);
            }
        }
        return hashSet;
    }

    public final void h0(@j.N String str) {
        z(new s(str), false);
    }

    @j.N
    public final E i(@j.N Fragment fragment) {
        String str = fragment.mWho;
        G g12 = this.f46365c;
        E e12 = g12.f46439b.get(str);
        if (e12 != null) {
            return e12;
        }
        E e13 = new E(this.f46376n, g12, fragment);
        e13.j(this.f46384v.f46584c.getClassLoader());
        e13.f46296e = this.f46383u;
        return e13;
    }

    public final void i0(@j.P Bundle bundle) {
        C22962u c22962u;
        E e12;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f46384v.f46584c.getClassLoader());
                this.f46373k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f46384v.f46584c.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        G g12 = this.f46365c;
        HashMap<String, Bundle> map2 = g12.f46440c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(VoiceInfo.STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap<String, E> map3 = g12.f46439b;
        map3.clear();
        Iterator<String> it = fragmentManagerState.f46414b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c22962u = this.f46376n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = g12.i(null, it.next());
            if (bundleI != null) {
                Fragment fragment = this.f46361N.f46610E.get(((FragmentState) bundleI.getParcelable(VoiceInfo.STATE)).f46423c);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragment.toString();
                    }
                    e12 = new E(c22962u, g12, fragment, bundleI);
                } else {
                    e12 = new E(this.f46376n, this.f46365c, this.f46384v.f46584c.getClassLoader(), O(), bundleI);
                }
                Fragment fragment2 = e12.f46294c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment2.toString();
                }
                e12.j(this.f46384v.f46584c.getClassLoader());
                g12.g(e12);
                e12.f46296e = this.f46383u;
            }
        }
        C22967z c22967z = this.f46361N;
        c22967z.getClass();
        Iterator it2 = new ArrayList(c22967z.f46610E.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.f46414b);
                }
                this.f46361N.ne(fragment3);
                fragment3.mFragmentManager = this;
                E e13 = new E(c22962u, g12, fragment3);
                e13.f46296e = 1;
                e13.i();
                fragment3.mRemoving = true;
                e13.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f46415c;
        g12.f46438a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = g12.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(AK.c.k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragmentB.toString();
                }
                g12.a(fragmentB);
            }
        }
        if (fragmentManagerState.f46416d != null) {
            this.f46366d = new ArrayList<>(fragmentManagerState.f46416d.length);
            int i12 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f46416d;
                if (i12 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i12];
                backStackRecordState.getClass();
                C22943a c22943a = new C22943a(this);
                backStackRecordState.a(c22943a);
                c22943a.f46528s = backStackRecordState.f46276h;
                int i13 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = backStackRecordState.f46271c;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i13);
                    if (str4 != null) {
                        c22943a.f46442a.get(i13).f46459b = g12.b(str4);
                    }
                    i13++;
                }
                c22943a.s(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c22943a.toString();
                    PrintWriter printWriter = new PrintWriter(new l0());
                    c22943a.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f46366d.add(c22943a);
                i12++;
            }
        } else {
            this.f46366d = null;
        }
        this.f46371i.set(fragmentManagerState.f46417e);
        String str5 = fragmentManagerState.f46418f;
        if (str5 != null) {
            Fragment fragmentB2 = g12.b(str5);
            this.f46387y = fragmentB2;
            t(fragmentB2);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f46419g;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f46372j.put(arrayList3.get(i14), fragmentManagerState.f46420h.get(i14));
            }
        }
        this.f46352E = new ArrayDeque<>(fragmentManagerState.f46421i);
    }

    public final void j(@j.N Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            G g12 = this.f46365c;
            synchronized (g12.f46438a) {
                g12.f46438a.remove(fragment);
            }
            fragment.mAdded = false;
            if (S(fragment)) {
                this.f46353F = true;
            }
            s0(fragment);
        }
    }

    @j.N
    public final Bundle j0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        J();
        Iterator it = h().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        B(true);
        this.f46354G = true;
        this.f46361N.f46615N = true;
        G g12 = this.f46365c;
        g12.getClass();
        HashMap<String, E> map = g12.f46439b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (E e12 : map.values()) {
            if (e12 != null) {
                Fragment fragment = e12.f46294c;
                g12.i(e12.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f46365c.f46440c;
        if (map2.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            G g13 = this.f46365c;
            synchronized (g13.f46438a) {
                try {
                    backStackRecordStateArr = null;
                    if (g13.f46438a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(g13.f46438a.size());
                        Iterator<Fragment> it2 = g13.f46438a.iterator();
                        while (it2.hasNext()) {
                            Fragment next = it2.next();
                            arrayList.add(next.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                next.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList<C22943a> arrayList3 = this.f46366d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i12 = 0; i12 < size; i12++) {
                    backStackRecordStateArr[i12] = new BackStackRecordState(this.f46366d.get(i12));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.f46366d.get(i12));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f46414b = arrayList2;
            fragmentManagerState.f46415c = arrayList;
            fragmentManagerState.f46416d = backStackRecordStateArr;
            fragmentManagerState.f46417e = this.f46371i.get();
            Fragment fragment2 = this.f46387y;
            if (fragment2 != null) {
                fragmentManagerState.f46418f = fragment2.mWho;
            }
            fragmentManagerState.f46419g.addAll(this.f46372j.keySet());
            fragmentManagerState.f46420h.addAll(this.f46372j.values());
            fragmentManagerState.f46421i = new ArrayList<>(this.f46352E);
            bundle.putParcelable(VoiceInfo.STATE, fragmentManagerState);
            for (String str : this.f46373k.keySet()) {
                bundle.putBundle(androidx.camera.camera2.internal.G.f("result_", str), this.f46373k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(androidx.camera.camera2.internal.G.f("fragment_", str2), map2.get(str2));
            }
        }
        return bundle;
    }

    public final void k(boolean z12, @j.N Configuration configuration) {
        if (z12 && (this.f46384v instanceof androidx.core.content.j)) {
            u0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z12) {
                    fragment.mChildFragmentManager.k(true, configuration);
                }
            }
        }
    }

    public final void k0(@j.N String str) {
        z(new t(str), false);
    }

    public final boolean l(@j.N MenuItem menuItem) {
        if (this.f46383u < 1) {
            return false;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @j.P
    public final Fragment.SavedState l0(@j.N Fragment fragment) {
        E e12 = this.f46365c.f46439b.get(fragment.mWho);
        if (e12 != null) {
            Fragment fragment2 = e12.f46294c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(e12.l());
                }
                return null;
            }
        }
        u0(new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final boolean m(@j.N Menu menu, @j.N MenuInflater menuInflater) {
        if (this.f46383u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z12 = false;
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z12 = true;
            }
        }
        if (this.f46367e != null) {
            for (int i12 = 0; i12 < this.f46367e.size(); i12++) {
                Fragment fragment2 = this.f46367e.get(i12);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f46367e = arrayList;
        return z12;
    }

    public final void m0() {
        synchronized (this.f46363a) {
            try {
                if (this.f46363a.size() == 1) {
                    this.f46384v.f46585d.removeCallbacks(this.f46362O);
                    this.f46384v.f46585d.post(this.f46362O);
                    w0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        boolean zIsChangingConfigurations = true;
        this.f46356I = true;
        B(true);
        Iterator it = h().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        androidx.fragment.app.r<?> rVar = this.f46384v;
        boolean z12 = rVar instanceof T0;
        G g12 = this.f46365c;
        if (z12) {
            zIsChangingConfigurations = g12.f46441d.f46614M;
        } else {
            ActivityC22955m activityC22955m = rVar.f46584c;
            if (activityC22955m != null) {
                zIsChangingConfigurations = true ^ activityC22955m.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it2 = this.f46372j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2.next().f46284b.iterator();
                while (it3.hasNext()) {
                    g12.f46441d.le((String) it3.next(), false);
                }
            }
        }
        w(-1);
        Object obj = this.f46384v;
        if (obj instanceof androidx.core.content.k) {
            ((androidx.core.content.k) obj).removeOnTrimMemoryListener(this.f46379q);
        }
        Object obj2 = this.f46384v;
        if (obj2 instanceof androidx.core.content.j) {
            ((androidx.core.content.j) obj2).removeOnConfigurationChangedListener(this.f46378p);
        }
        Object obj3 = this.f46384v;
        if (obj3 instanceof androidx.core.app.F) {
            ((androidx.core.app.F) obj3).removeOnMultiWindowModeChangedListener(this.f46380r);
        }
        Object obj4 = this.f46384v;
        if (obj4 instanceof androidx.core.app.H) {
            ((androidx.core.app.H) obj4).removeOnPictureInPictureModeChangedListener(this.f46381s);
        }
        Object obj5 = this.f46384v;
        if ((obj5 instanceof InterfaceC22842v) && this.f46386x == null) {
            ((InterfaceC22842v) obj5).removeMenuProvider(this.f46382t);
        }
        this.f46384v = null;
        this.f46385w = null;
        this.f46386x = null;
        if (this.f46369g != null) {
            Iterator<androidx.view.j> it4 = this.f46370h.f21287b.iterator();
            while (it4.hasNext()) {
                it4.next().cancel();
            }
            this.f46369g = null;
        }
        androidx.view.result.h<Intent> hVar = this.f46349B;
        if (hVar != null) {
            hVar.c();
            this.f46350C.c();
            this.f46351D.c();
        }
    }

    public final void n0(@j.N Fragment fragment, boolean z12) {
        ViewGroup viewGroupN = N(fragment);
        if (viewGroupN == null || !(viewGroupN instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupN).setDrawDisappearingViewsLast(!z12);
    }

    public final void o(boolean z12) {
        if (z12 && (this.f46384v instanceof androidx.core.content.k)) {
            u0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z12) {
                    fragment.mChildFragmentManager.o(true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(@j.N android.os.Bundle r4, @j.N java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$o> r0 = r3.f46374l
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.FragmentManager$o r0 = (androidx.fragment.app.FragmentManager.o) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.f46682e
            androidx.lifecycle.Lifecycle r2 = r0.f46403b
            androidx.lifecycle.Lifecycle$State r2 = r2.getF46705d()
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L1c
            r0.k(r4, r5)
            goto L21
        L1c:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r3.f46373k
            r0.put(r5, r4)
        L21:
            java.lang.String r5 = "FragmentManager"
            r0 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r0)
            if (r5 == 0) goto L2d
            java.util.Objects.toString(r4)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.o0(android.os.Bundle, java.lang.String):void");
    }

    public final void p(boolean z12, boolean z13) {
        if (z13 && (this.f46384v instanceof androidx.core.app.F)) {
            u0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z12);
                if (z13) {
                    fragment.mChildFragmentManager.p(z12, true);
                }
            }
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void p0(@j.N String str, @j.N InterfaceC22983P interfaceC22983P, @j.N C c12) {
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        if (lifecycle.getF46705d() == Lifecycle.State.f46679b) {
            return;
        }
        g gVar = new g(str, c12, lifecycle);
        o oVarPut = this.f46374l.put(str, new o(lifecycle, c12, gVar));
        if (oVarPut != null) {
            oVarPut.f46403b.c(oVarPut.f46405d);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            lifecycle.toString();
            Objects.toString(c12);
        }
        lifecycle.a(gVar);
    }

    public final void q() {
        Iterator it = this.f46365c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.q();
            }
        }
    }

    public final void q0(@j.N Fragment fragment, @j.N Lifecycle.State state) {
        if (fragment.equals(this.f46365c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final boolean r(@j.N MenuItem menuItem) {
        if (this.f46383u < 1) {
            return false;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r0(@j.P Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f46365c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f46387y;
        this.f46387y = fragment;
        t(fragment2);
        t(this.f46387y);
    }

    public final void s(@j.N Menu menu) {
        if (this.f46383u < 1) {
            return;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s0(@j.N Fragment fragment) {
        ViewGroup viewGroupN = N(fragment);
        if (viewGroupN != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupN.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupN.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupN.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void t(@j.P Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f46365c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t0() {
        Iterator it = this.f46365c.d().iterator();
        while (it.hasNext()) {
            E e12 = (E) it.next();
            Fragment fragment = e12.f46294c;
            if (fragment.mDeferStart) {
                if (this.f46364b) {
                    this.f46357J = true;
                } else {
                    fragment.mDeferStart = false;
                    e12.i();
                }
            }
        }
    }

    @j.N
    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(128, "FragmentManager{");
        sbQ.append(Integer.toHexString(System.identityHashCode(this)));
        sbQ.append(" in ");
        Fragment fragment = this.f46386x;
        if (fragment != null) {
            sbQ.append(fragment.getClass().getSimpleName());
            sbQ.append("{");
            sbQ.append(Integer.toHexString(System.identityHashCode(this.f46386x)));
            sbQ.append("}");
        } else {
            androidx.fragment.app.r<?> rVar = this.f46384v;
            if (rVar != null) {
                sbQ.append(rVar.getClass().getSimpleName());
                sbQ.append("{");
                sbQ.append(Integer.toHexString(System.identityHashCode(this.f46384v)));
                sbQ.append("}");
            } else {
                sbQ.append("null");
            }
        }
        sbQ.append("}}");
        return sbQ.toString();
    }

    public final void u(boolean z12, boolean z13) {
        if (z13 && (this.f46384v instanceof androidx.core.app.H)) {
            u0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z12);
                if (z13) {
                    fragment.mChildFragmentManager.u(z12, true);
                }
            }
        }
    }

    public final void u0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new l0());
        androidx.fragment.app.r<?> rVar = this.f46384v;
        try {
            if (rVar != null) {
                rVar.d(printWriter, new String[0]);
            } else {
                y("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final boolean v(@j.N Menu menu) {
        boolean z12 = false;
        if (this.f46383u < 1) {
            return false;
        }
        for (Fragment fragment : this.f46365c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z12 = true;
            }
        }
        return z12;
    }

    public final void v0(@j.N n nVar) {
        C22962u c22962u = this.f46376n;
        synchronized (c22962u.f46603a) {
            try {
                int size = c22962u.f46603a.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    if (c22962u.f46603a.get(i12).f46605a == nVar) {
                        c22962u.f46603a.remove(i12);
                        break;
                    }
                    i12++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(int i12) {
        try {
            this.f46364b = true;
            for (E e12 : this.f46365c.f46439b.values()) {
                if (e12 != null) {
                    e12.f46296e = i12;
                }
            }
            W(i12, false);
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.f46364b = false;
            B(true);
        } catch (Throwable th2) {
            this.f46364b = false;
            throw th2;
        }
    }

    public final void w0() {
        synchronized (this.f46363a) {
            try {
                if (this.f46363a.isEmpty()) {
                    this.f46370h.d(L() > 0 && U(this.f46386x));
                } else {
                    this.f46370h.d(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        if (this.f46357J) {
            this.f46357J = false;
            t0();
        }
    }

    public final void y(@j.N String str, @j.P FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.P String[] strArr) {
        int size;
        int size2;
        String strQ = androidx.appcompat.app.r.q(str, "    ");
        G g12 = this.f46365c;
        g12.getClass();
        String str2 = str + "    ";
        HashMap<String, E> map = g12.f46439b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (E e12 : map.values()) {
                printWriter.print(str);
                if (e12 != null) {
                    Fragment fragment = e12.f46294c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = g12.f46438a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i12 = 0; i12 < size3; i12++) {
                Fragment fragment2 = arrayList.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f46367e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i13 = 0; i13 < size2; i13++) {
                Fragment fragment3 = this.f46367e.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<C22943a> arrayList3 = this.f46366d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i14 = 0; i14 < size; i14++) {
                C22943a c22943a = this.f46366d.get(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(c22943a.toString());
                c22943a.u(strQ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f46371i.get());
        synchronized (this.f46363a) {
            try {
                int size4 = this.f46363a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i15 = 0; i15 < size4; i15++) {
                        Object obj = (q) this.f46363a.get(i15);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i15);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f46384v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f46385w);
        if (this.f46386x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f46386x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f46383u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f46354G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f46355H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f46356I);
        if (this.f46353F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f46353F);
        }
    }

    public final void z(@j.N q qVar, boolean z12) {
        if (!z12) {
            if (this.f46384v == null) {
                if (!this.f46356I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (V()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f46363a) {
            try {
                if (this.f46384v == null) {
                    if (!z12) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f46363a.add(qVar);
                    m0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static abstract class n {
        public void onFragmentDestroyed(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentDetached(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentPaused(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentResumed(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentStarted(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentStopped(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        public void onFragmentViewDestroyed(@j.N FragmentManager fragmentManager, @j.N Fragment fragment) {
        }

        @Deprecated
        public void onFragmentActivityCreated(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.P Bundle bundle) {
        }

        public void onFragmentAttached(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.N Context context) {
        }

        public void onFragmentCreated(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.P Bundle bundle) {
        }

        public void onFragmentPreAttached(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.N Context context) {
        }

        public void onFragmentPreCreated(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.P Bundle bundle) {
        }

        public void onFragmentSaveInstanceState(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.N Bundle bundle) {
        }

        public void onFragmentViewCreated(@j.N FragmentManager fragmentManager, @j.N Fragment fragment, @j.N View view, @j.P Bundle bundle) {
        }
    }

    public interface p {
        @j.K
        void a();

        @j.K
        default void b(@j.N Fragment fragment, boolean z12) {
        }

        @j.K
        default void c(@j.N Fragment fragment, boolean z12) {
        }
    }
}
