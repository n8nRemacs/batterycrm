package com.avito.android.profile.user_profile;

import com.avito.android.R;
import com.avito.android.di.InterfaceC30272y;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: UserProfileMenuProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/u;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.o f226589a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f226590b = C42727D.c(new b());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f226591c = C42727D.c(new a());

    /* compiled from: UserProfileMenuProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/avito/component/appbar/ActionMenu;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ActionMenu> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ActionMenu invoke() {
            u uVar = u.this;
            String strF = uVar.f226589a.f();
            uVar.f226589a.getClass();
            return new ActionMenu(strF, 1, Integer.valueOf(R.drawable.ic_up_notifications_24), Integer.valueOf(R.attr.blue), null, 16, null);
        }
    }

    /* compiled from: UserProfileMenuProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/avito/component/appbar/ActionMenu;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ActionMenu> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ActionMenu invoke() {
            u uVar = u.this;
            String strC = uVar.f226589a.c();
            uVar.f226589a.getClass();
            return new ActionMenu(strC, 2, Integer.valueOf(R.drawable.ic_up_settings_24), Integer.valueOf(R.attr.blue), null, 16, null);
        }
    }

    @Inject
    public u(@Y61.k com.avito.android.profile.user_profile.cards.o oVar) {
        this.f226589a = oVar;
    }
}
