package com.avito.android.computer_vision;

import Hq0.C14020b;
import Jd0.C14188a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.publish.analytics.InterfaceC33515a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import okhttp3.MultipartBody;
import yc.C50213a;

/* compiled from: MultiUploadComputerVisionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/computer_vision/c;", "Lcom/avito/android/computer_vision/a;", "a", "_avito_photo-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.computer_vision.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C14188a f125445a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC33515a f125446b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.photo_picker.converter.c f125447c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f125448d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50213a f125449e;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f125453i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f125454j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f125455k;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Uri> f125450f = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f125451g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f125452h = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    @k
    public String f125456l = "";

    /* renamed from: m, reason: collision with root package name */
    public int f125457m = 5;

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/computer_vision/c$a;", "", "_avito_photo-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public String f125458a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f125459b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f125460c;

        public a(String str, Uri uri, String str2, int i12, C42822w c42822w) {
            str2 = (i12 & 4) != 0 ? null : str2;
            this.f125458a = str;
            this.f125459b = uri;
            this.f125460c = str2;
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/computer_vision/c$a;", "it", "", "invoke", "(Lcom/avito/android/computer_vision/c$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f125461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f125461l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(a aVar) {
            return Boolean.valueOf(L.f(aVar.f125458a, this.f125461l));
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/computer_vision/c$a;", "it", "", "invoke", "(Lcom/avito/android/computer_vision/c$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.computer_vision.c$c, reason: collision with other inner class name */
    public static final class C3726c extends N implements Y41.l<a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f125462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3726c(String str) {
            super(1);
            this.f125462l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(a aVar) {
            return Boolean.valueOf(L.f(aVar.f125458a, this.f125462l));
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.f125446b.b();
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "uploadUri", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "", "apply", "(Landroid/net/Uri;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MultipartBody.Part f125465c;

        public e(MultipartBody.Part part) {
            this.f125465c = part;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Uri uri = (Uri) obj;
            c cVar = c.this;
            return new C41936b0(cVar.f125447c.a(uri, com.avito.android.computer_vision.b.f125444a).j0(cVar.f125448d.a()).d0(com.avito.android.computer_vision.f.f125470b), new com.avito.android.computer_vision.g(cVar, this.f125465c)).d0(new h(uri));
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Object next;
            Q q12 = (Q) obj;
            Uri uri = (Uri) q12.f406619b;
            String str = (String) q12.f406620c;
            c cVar = c.this;
            Iterator it = cVar.f125451g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((a) next).f125459b, uri)) {
                        break;
                    }
                }
            }
            a aVar = (a) next;
            if (aVar != null) {
                aVar.f125460c = str;
            }
            cVar.f125455k = true;
        }
    }

    /* compiled from: MultiUploadComputerVisionInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f125467b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("ComputerVisionInteractor", "Error during image upload for computer vision recognition", (Throwable) obj);
        }
    }

    public c(@k C14188a c14188a, @k InterfaceC33515a interfaceC33515a, @k com.avito.android.photo_picker.converter.c cVar, @k InterfaceC35745a5 interfaceC35745a5, @k C50213a c50213a) {
        this.f125445a = c14188a;
        this.f125446b = interfaceC33515a;
        this.f125447c = cVar;
        this.f125448d = interfaceC35745a5;
        this.f125449e = c50213a;
    }

    public final void a() {
        if (this.f125453i == null) {
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("publishSessionId", this.f125449e.b());
            O oK2 = this.f125450f.K(new d());
            InterfaceC35745a5 interfaceC35745a5 = this.f125448d;
            this.f125453i = (y) oK2.j0(interfaceC35745a5.f()).T(new e(partCreateFormData), Integer.MAX_VALUE).j0(interfaceC35745a5.c()).v0(new f(), g.f125467b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.computer_vision.a
    public final void b(@k String str) {
        if (this.f125454j) {
            ArrayList arrayList = this.f125451g;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (L.f(((a) it.next()).f125458a, str)) {
                        this.f125455k = true;
                        break;
                    }
                }
            }
            C42745f0.l0(new b(str), arrayList);
            ArrayList arrayList2 = this.f125452h;
            C42745f0.l0(new C3726c(str), arrayList2);
            if (arrayList.size() >= this.f125457m || arrayList2.isEmpty()) {
                return;
            }
            a();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (arrayList.size() < this.f125457m) {
                    arrayList.add(aVar);
                    this.f125450f.accept(aVar.f125459b);
                    it2.remove();
                }
            }
        }
    }

    @Override // com.avito.android.computer_vision.a
    public final void c(@k Uri uri, @k String str) {
        Object obj;
        Object next;
        Iterator it = this.f125451g.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((a) next).f125459b, uri)) {
                    break;
                }
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            aVar.f125458a = str;
        }
        Iterator it2 = this.f125452h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (L.f(((a) next2).f125459b, uri)) {
                obj = next2;
                break;
            }
        }
        a aVar2 = (a) obj;
        if (aVar2 == null) {
            return;
        }
        aVar2.f125458a = str;
    }

    @Override // com.avito.android.computer_vision.a
    public final boolean d() {
        return this.f125454j && !this.f125451g.isEmpty() && this.f125455k;
    }

    @Override // com.avito.android.computer_vision.a
    public final boolean e() {
        ArrayList arrayList;
        if (this.f125454j && ((arrayList = this.f125451g) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((a) it.next()).f125460c;
                if (str == null || str.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.avito.android.computer_vision.a
    @k
    public final io.reactivex.rxjava3.internal.operators.single.O f() {
        ArrayList arrayList = this.f125451g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((a) it.next()).f125460c;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return g1.a(new C42007e(new C14020b(8, this, C42745f0.P0(arrayList2)))).z(this.f125448d.c()).k(new com.avito.android.computer_vision.d(this)).r(com.avito.android.computer_vision.e.f125469b);
    }

    @Override // com.avito.android.computer_vision.a
    public final void g(@l Integer num) {
        this.f125457m = (num == null || num.intValue() <= 0) ? 5 : num.intValue();
    }

    @Override // com.avito.android.computer_vision.a
    public final void h(boolean z12) {
        C50213a c50213a = this.f125449e;
        if (!L.f(c50213a.b(), this.f125456l)) {
            this.f125456l = c50213a.b();
            this.f125451g.clear();
            this.f125452h.clear();
        }
        this.f125454j = z12;
    }

    @Override // com.avito.android.computer_vision.a
    public final void i(@k Uri uri, @k String str) {
        if (this.f125454j) {
            a();
            ArrayList arrayList = this.f125451g;
            if (arrayList.size() >= this.f125457m) {
                this.f125452h.add(new a(str, uri, null, 4, null));
            } else {
                arrayList.add(new a(str, uri, null, 4, null));
                this.f125450f.accept(uri);
            }
        }
    }

    @Override // com.avito.android.computer_vision.a
    public final void reset() {
        y yVar = this.f125453i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f125453i = null;
        this.f125454j = false;
    }
}
