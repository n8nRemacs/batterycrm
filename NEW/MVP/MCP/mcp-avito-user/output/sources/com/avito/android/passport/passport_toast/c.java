package com.avito.android.passport.passport_toast;

import Y41.l;
import Y61.k;
import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import k60.C42524a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: PassportToastHandlerImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/passport_toast/c;", "LG50/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class c implements G50.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42524a f211147a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f211148b = new LinkedHashMap();

    /* compiled from: PassportToastHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<WeakReference<Activity>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f211149l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(1);
            this.f211149l = activity;
        }

        @Override // Y41.l
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            return Boolean.valueOf(weakReference.get() == this.f211149l);
        }
    }

    @Inject
    public c(@k C42524a c42524a) {
        this.f211147a = c42524a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G50.a
    public final void a(@k PrintableText printableText, @k kotlin.reflect.d<? extends DeepLink> dVar) {
        List list;
        C42524a c42524a = this.f211147a;
        c42524a.getClass();
        n<Object> nVar = C42524a.f406098e[2];
        if (((Boolean) c42524a.f406101d.a().invoke()).booleanValue()) {
            synchronized (this.f211148b) {
                C42745f0.k0(this.f211148b.entrySet(), b.f211146l);
            }
            String strB = com.avito.android.deep_linking.links.storage.a.f134018a.b(((InterfaceC42819t) dVar).f());
            synchronized (this.f211148b) {
                list = (List) this.f211148b.remove(strB);
            }
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) ((WeakReference) it.next()).get();
                if (activity != null) {
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        activity = null;
                    }
                    if (activity != null) {
                        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
                        viewGroup.post(new RunnableC28882d(20, viewGroup, printableText));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G50.a
    public final void b(@k Activity activity, @k kotlin.reflect.d<? extends DeepLink> dVar) {
        C42524a c42524a = this.f211147a;
        c42524a.getClass();
        n<Object> nVar = C42524a.f406098e[2];
        if (((Boolean) c42524a.f406101d.a().invoke()).booleanValue()) {
            String strB = com.avito.android.deep_linking.links.storage.a.f134018a.b(((InterfaceC42819t) dVar).f());
            synchronized (this.f211148b) {
                try {
                    LinkedHashMap linkedHashMap = this.f211148b;
                    Object arrayList = linkedHashMap.get(strB);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strB, arrayList);
                    }
                    List list = (List) arrayList;
                    C42745f0.l0(new a(activity), list);
                    list.add(new WeakReference(activity));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
