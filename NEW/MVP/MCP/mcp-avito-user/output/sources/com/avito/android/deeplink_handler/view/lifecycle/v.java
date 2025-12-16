package com.avito.android.deeplink_handler.view.lifecycle;

import android.widget.FrameLayout;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sv.C48419b;

/* compiled from: ToastRendererLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0003\u0005\u0006\u0007B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/v;", "Lcom/avito/android/deeplink_handler/view/a$i;", "Lcom/avito/android/deeplink_handler/view/lifecycle/n;", "<init>", "()V", "a", "b", "c", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class v implements a.i, n<a.i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<b> f134692b = new D<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D<a> f134693c = new D<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D<c> f134694d = new D<>();

    /* compiled from: ToastRendererLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/v$a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f134695a;

        public a(int i12) {
            this.f134695a = i12;
        }
    }

    /* compiled from: ToastRendererLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/v$b;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f134696a;

        public b(@Y61.k String str) {
            this.f134696a = str;
        }
    }

    /* compiled from: ToastRendererLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/v$c;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f134697a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<c.a> f134698b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<c.a> f134699c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final FrameLayout f134700d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f134701e;

        /* renamed from: f, reason: collision with root package name */
        public final int f134702f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final ToastBarPosition f134703g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f134704h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f134705i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final i.b f134706j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f134707k;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
            this.f134697a = printableText;
            this.f134698b = list;
            this.f134699c = list2;
            this.f134700d = frameLayout;
            this.f134701e = fVar;
            this.f134702f = i12;
            this.f134703g = toastBarPosition;
            this.f134704h = z12;
            this.f134705i = z13;
            this.f134706j = bVar;
            this.f134707k = str;
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.i f134708b;

        public d(a.i iVar) {
            this.f134708b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                this.f134708b.Y1(((a) t12).f134695a);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.i f134709b;

        public e(a.i iVar) {
            this.f134709b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                this.f134709b.z1(((b) t12).f134696a);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.i f134710b;

        public f(a.i iVar) {
            this.f134710b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                c cVar = (c) t12;
                this.f134710b.V0(cVar.f134697a, cVar.f134698b, cVar.f134699c, cVar.f134700d, cVar.f134701e, cVar.f134702f, cVar.f134703g, cVar.f134704h, cVar.f134705i, cVar.f134706j, cVar.f134707k);
            }
        }
    }

    @Inject
    public v() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        C48419b.a(this.f134694d, new c(printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, z12, z13, bVar, str));
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        C48419b.a(this.f134693c, new a(i12));
    }

    public final void a(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k a.i iVar) {
        this.f134693c.observe(interfaceC22983P, new d(iVar));
        this.f134692b.observe(interfaceC22983P, new e(iVar));
        this.f134694d.observe(interfaceC22983P, new f(iVar));
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void b2(int i12, @Y61.k f.c cVar, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.a(this, i12, cVar, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void m0(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.b(this, str, fVar, i12, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void z1(@Y61.k String str) {
        C48419b.a(this.f134692b, new b(str));
    }
}
