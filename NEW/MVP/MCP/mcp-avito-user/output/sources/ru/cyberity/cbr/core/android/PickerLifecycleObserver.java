package ru.cyberity.cbr.core.android;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.result.h;
import androidx.view.result.j;
import com.avito.android.remote.model.SearchParamsConverterKt;
import i.AbstractC41201a;
import i.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.analytics.f;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: PickerLifecycleObserver.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u0002\u001d Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u001e\b\u0002\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b\u001d\u0010#R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R$\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010&R$\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b \u0010+\"\u0004\b\u0015\u0010,R\"\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/cyberity/cbr/core/android/PickerLifecycleObserver;", "Landroidx/lifecycle/q;", "Landroidx/activity/result/j;", "registry", "", "id", "", "mimeTypes", "Lkotlin/Function2;", "Landroid/net/Uri;", "Lkotlin/G0;", "singlePickCallback", "", "multiplePickCallback", "<init>", "(Landroidx/activity/result/j;Ljava/lang/String;[Ljava/lang/String;LY41/p;LY41/p;)V", "e", "()V", "d", "f", "", "c", "()Z", "Landroidx/lifecycle/P;", SearchParamsConverterKt.OWNER, "onCreate", "(Landroidx/lifecycle/P;)V", "onDestroy", "requestId", "a", "(Ljava/lang/String;)Z", "Landroidx/activity/result/j;", "b", "Ljava/lang/String;", "[Ljava/lang/String;", "()[Ljava/lang/String;", "LY41/p;", "Landroidx/activity/result/h;", "Landroidx/activity/result/h;", "getSingleContent", "g", "getMultipleContent", "h", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "Lru/cyberity/cbr/core/android/PickerLifecycleObserver$b;", "i", "Ljava/util/List;", "requestBuilders", "j", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class PickerLifecycleObserver implements InterfaceC23057q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final j registry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String[] mimeTypes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<String, Uri, G0> singlePickCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<String, List<? extends Uri>, G0> multiplePickCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private h<String[]> getSingleContent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private h<String[]> getMultipleContent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private String requestId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<b<?, ?>> requestBuilders;

    /* compiled from: PickerLifecycleObserver.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006\u0012:\b\u0002\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\f\u0012!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R2\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'RI\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R2\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u00068\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b(\u0010'R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010-¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/android/PickerLifecycleObserver$b;", "I", "O", "", "", "requestId", "Lkotlin/Function1;", "Lkotlin/S;", "name", "input", "Landroid/content/Intent;", "intentBuilder", "Lkotlin/Function2;", "", "resultCode", "data", "resultParser", "output", "Lkotlin/G0;", "callback", "<init>", "(Ljava/lang/String;LY41/l;LY41/p;LY41/l;)V", "Li/a;", "b", "()Li/a;", "Landroidx/activity/result/a;", "a", "()Landroidx/activity/result/a;", "Landroidx/activity/result/j;", "registry", "uniqueId", "(Landroidx/activity/result/j;Ljava/lang/String;)V", "g", "()V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LY41/l;", "d", "()LY41/l;", "c", "LY41/p;", "f", "()LY41/p;", "Landroidx/activity/result/h;", "Landroidx/activity/result/h;", "requestLauncher", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b<I, O> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String requestId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @k
        private final Y41.l<I, Intent> intentBuilder;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final p<Integer, Intent, O> resultParser;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @k
        private final Y41.l<O, G0> callback;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private h<I> requestLauncher;

        /* compiled from: PickerLifecycleObserver.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/core/android/PickerLifecycleObserver$b$b", "Li/a;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.android.PickerLifecycleObserver$b$b, reason: collision with other inner class name */
        public static final class C12431b extends AbstractC41201a<I, O> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<I, O> f432579a;

            public C12431b(b<I, O> bVar) {
                this.f432579a = bVar;
            }

            @Override // i.AbstractC41201a
            @k
            public Intent createIntent(@k Context context, I input) {
                return this.f432579a.d().invoke(input);
            }

            @Override // i.AbstractC41201a
            public O parseResult(int resultCode, @l Intent intent) {
                return this.f432579a.f().invoke(Integer.valueOf(resultCode), intent);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k String str, @k Y41.l<? super I, ? extends Intent> lVar, @k p<? super Integer, ? super Intent, ? extends O> pVar, @k Y41.l<? super O, G0> lVar2) {
            this.requestId = str;
            this.intentBuilder = lVar;
            this.resultParser = pVar;
            this.callback = lVar2;
        }

        private final androidx.view.result.a<O> a() {
            return new com.avito.android.str_seller_orders.orders_seller.a(this, 12);
        }

        @k
        public final Y41.l<I, Intent> d() {
            return this.intentBuilder;
        }

        @k
        public final p<Integer, Intent, O> f() {
            return this.resultParser;
        }

        public final void g() {
            h<I> hVar = this.requestLauncher;
            if (hVar != null) {
                hVar.c();
            }
            this.requestLauncher = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar, Object obj) {
            Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(bVar), "PickerLifecycleObserver.callback: " + bVar.requestId, null, 4, null);
            bVar.callback.invoke(obj);
        }

        private final AbstractC41201a<I, O> b() {
            return new C12431b(this);
        }

        public final void a(@k j registry, @k String uniqueId) {
            this.requestLauncher = registry.e(H.o(new StringBuilder(), this.requestId, '_', uniqueId), b(), a());
        }

        public /* synthetic */ b(String str, Y41.l lVar, p pVar, Y41.l lVar2, int i12, C42822w c42822w) {
            this(str, lVar, (i12 & 4) != 0 ? a.f432578a : pVar, lVar2);
        }

        /* compiled from: PickerLifecycleObserver.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"I", "O", "", "<anonymous parameter 0>", "Landroid/content/Intent;", "data", "a", "(ILandroid/content/Intent;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends N implements p<Integer, Intent, O> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f432578a = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Intent intent) {
                return a(num.intValue(), intent);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final O a(int i12, @l Intent intent) {
                return intent;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickerLifecycleObserver(@k j jVar, @k String str, @l String[] strArr, @l p<? super String, ? super Uri, G0> pVar, @l p<? super String, ? super List<? extends Uri>, G0> pVar2) {
        this.registry = jVar;
        this.id = str;
        this.mimeTypes = strArr;
        this.singlePickCallback = pVar;
        this.multiplePickCallback = pVar2;
        this.requestBuilders = new ArrayList();
    }

    private final void d() {
        ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().m().c(), false, 1, null);
    }

    private final void e() {
        ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().o().c(), false, 1, null);
    }

    private final void f() {
        ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().b().c(), false, 1, null);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String[] getMimeTypes() {
        return this.mimeTypes;
    }

    @Override // androidx.view.InterfaceC23057q
    public void onCreate(@k InterfaceC22983P owner) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "PickerLifecycleObserver.onCreate: requestId=" + this.requestId, null, 4, null);
        final int i12 = 0;
        this.getSingleContent = this.registry.e("singlePicker_" + this.id, new b.e(), new androidx.view.result.a(this) { // from class: ru.cyberity.cbr.core.android.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PickerLifecycleObserver f432582c;

            {
                this.f432582c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        PickerLifecycleObserver.a(this.f432582c, (Uri) obj);
                        break;
                    default:
                        PickerLifecycleObserver.a(this.f432582c, (List) obj);
                        break;
                }
            }
        });
        final int i13 = 1;
        this.getMultipleContent = this.registry.e("multiplePicker_" + this.id, new b.g(), new androidx.view.result.a(this) { // from class: ru.cyberity.cbr.core.android.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PickerLifecycleObserver f432582c;

            {
                this.f432582c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        PickerLifecycleObserver.a(this.f432582c, (Uri) obj);
                        break;
                    default:
                        PickerLifecycleObserver.a(this.f432582c, (List) obj);
                        break;
                }
            }
        });
        Iterator<T> it = this.requestBuilders.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this.registry, this.id);
        }
    }

    @Override // androidx.view.InterfaceC23057q
    public void onDestroy(@k InterfaceC22983P owner) {
        h<String[]> hVar = this.getSingleContent;
        if (hVar != null) {
            hVar.c();
        }
        h<String[]> hVar2 = this.getMultipleContent;
        if (hVar2 != null) {
            hVar2.c();
        }
        Iterator<T> it = this.requestBuilders.iterator();
        while (it.hasNext()) {
            ((b) it.next()).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(PickerLifecycleObserver pickerLifecycleObserver, Uri uri) {
        if (uri == null) {
            pickerLifecycleObserver.d();
        } else {
            pickerLifecycleObserver.e();
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(pickerLifecycleObserver), "PickerLifecycleObserver.getSingleContent.callback requestId=" + pickerLifecycleObserver.requestId, null, 4, null);
        String str = pickerLifecycleObserver.requestId;
        if (str != null) {
            p<String, Uri, G0> pVar = pickerLifecycleObserver.singlePickCallback;
            if (pVar != null) {
                pVar.invoke(str, uri);
            }
            pickerLifecycleObserver.requestId = null;
        }
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final void c(@l String str) {
        this.requestId = str;
    }

    private final boolean c() {
        String[] strArr = this.mimeTypes;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!C43066x.q(str, "image", false)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ PickerLifecycleObserver(j jVar, String str, String[] strArr, p pVar, p pVar2, int i12, C42822w c42822w) {
        this(jVar, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : strArr, (i12 & 8) != 0 ? null : pVar, (i12 & 16) != 0 ? null : pVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(PickerLifecycleObserver pickerLifecycleObserver, List list) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(pickerLifecycleObserver), "PickerLifecycleObserver.getMultipleContent.callback requestId=" + pickerLifecycleObserver.requestId, null, 4, null);
        if (list == null) {
            pickerLifecycleObserver.d();
        } else {
            pickerLifecycleObserver.e();
        }
        String str = pickerLifecycleObserver.requestId;
        if (str != null) {
            p<String, List<? extends Uri>, G0> pVar = pickerLifecycleObserver.multiplePickCallback;
            if (pVar != null) {
                pVar.invoke(str, list);
            }
            pickerLifecycleObserver.requestId = null;
        }
    }

    public final boolean a(@k String requestId) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "PickerLifecycleObserver.selectFile: ".concat(requestId), null, 4, null);
        f();
        this.requestId = requestId;
        try {
            h<String[]> hVar = this.getSingleContent;
            if (hVar != null) {
                hVar.b(this.mimeTypes);
            }
            return true;
        } catch (ActivityNotFoundException e12) {
            ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a(this), "PickerLifecycleObserver.selectMultipleFile: ".concat(requestId), e12);
            return false;
        }
    }
}
