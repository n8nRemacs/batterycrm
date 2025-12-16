package com.avito.android.user_advert.advert.delegate.multi_items;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import Y61.k;
import Y61.l;
import com.avito.android.C29640d;
import com.avito.android.advert_multi_items.model.ModificationItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.user_advert.advert.delegate.multi_items.f;
import com.avito.android.util.Kundle;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;

/* compiled from: MultiItemsBlockPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/d;", "LfH0/a;", "LQa/a;", "LQa/c;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes4.dex */
public final class d extends AbstractC40291a implements InterfaceC14873a, InterfaceC14875c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C29640d f308677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f308678e;

    /* compiled from: MultiItemsBlockPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/d$a;", "", "<init>", "()V", "", "KEY_SHOULD_TRACK_SHOWN", "Ljava/lang/String;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public d(@l Kundle kundle, @k C29640d c29640d) {
        this.f308677d = c29640d;
        this.f308678e = kundle != null ? kundle.f318647b.getBoolean("KEY_SHOULD_TRACK_MULTI_ITEMS_SHOWN", true) : true;
    }

    @Override // Qa.InterfaceC14873a
    public final void E1(@k ModificationItem modificationItem) {
        this.f395801b.accept(new f.a(modificationItem));
        this.f308678e = true;
    }

    @Override // Qa.InterfaceC14873a, Me.p
    public final void d(@k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    @Override // Qa.InterfaceC14873a
    public final boolean g2() {
        C29640d c29640d = this.f308677d;
        c29640d.getClass();
        n<Object> nVar = C29640d.f132175X[32];
        return ((Boolean) c29640d.f132181F.a().invoke()).booleanValue();
    }

    @Override // Qa.InterfaceC14875c
    public final void p() {
        if (this.f308678e) {
            this.f395801b.accept(f.b.f308682a);
            this.f308678e = false;
        }
    }
}
