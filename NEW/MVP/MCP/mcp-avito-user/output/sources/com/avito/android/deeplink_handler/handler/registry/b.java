package com.avito.android.deeplink_handler.handler.registry;

import Y61.k;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.version_conflict.i;
import gv.InterfaceC40741c;
import iv.C42114a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import lv.C43834a;

/* compiled from: DeeplinkHandlerRegistryFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/b;", "Landroidx/lifecycle/a;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Class<DeepLink>, C43834a> f134548d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.d f134549e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C42114a f134550f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_events.registry.d f134551g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final i f134552h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final P f134553i;

    /* compiled from: DeeplinkHandlerRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/b$a;", "", "<init>", "()V", "", "MODEL_CLASS_NON_VALID_MESSAGE", "Ljava/lang/String;", "NULL_REGISTRY_MESSAGE", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    public b(@k Map<Class<DeepLink>, C43834a> map, @k com.avito.android.deeplink_handler.handler.d dVar, @k C42114a c42114a, @k com.avito.android.deeplink_events.registry.d dVar2, @k i iVar, @k P p12, @k InterfaceC40741c interfaceC40741c) {
        InterfaceC23487e interfaceC23487eA = interfaceC40741c.a();
        if (interfaceC23487eA == null) {
            throw new IllegalArgumentException("SavedStateRegistryOwner must not be null to create DeeplinkHandlerRegistry!\nPlease, provide a valid DeeplinkHandlerParent.");
        }
        super(interfaceC23487eA, null);
        this.f134548d = map;
        this.f134549e = dVar;
        this.f134550f = c42114a;
        this.f134551g = dVar2;
        this.f134552h = iVar;
        this.f134553i = p12;
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public final <T extends M0> T create(@k String str, @k Class<T> cls, @k C23060r0 c23060r0) {
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f134548d, this.f134549e, c23060r0, this.f134550f, null, this.f134551g, this.f134552h, this.f134553i, 16, null);
        }
        throw new IllegalArgumentException("DeeplinkHandlerRegistryFactory can create only DeeplinkHandlerRegistryImpl!");
    }
}
