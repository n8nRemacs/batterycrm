package com.avito.android.di.module;

import com.avito.android.remote.model.ActualizePhonesScenarioResult;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.ParsingPermissionResult;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.SocialProceedResult;
import com.avito.android.remote.model.profile_removal.RemovalButton;
import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.avito.android.remote.parse.adapter.ActualizePhonesScenarioResultTypeAdapter;
import com.avito.android.remote.parse.adapter.AuthResultTypeAdapter;
import com.avito.android.remote.parse.adapter.LoginResultOkTypeAdapter;
import com.avito.android.remote.parse.adapter.ParsingPermissionResultOkTypeAdapter;
import com.avito.android.remote.parse.adapter.ProfileRemovalButtonTypeAdapter;
import com.avito.android.remote.parse.adapter.ProfileRemovalItemTypeAdapter;
import com.avito.android.remote.parse.adapter.SocialAuthResultOkTypeAdapter;
import com.avito.android.remote.parse.adapter.SocialProceedResultOkTypeAdapter;
import com.avito.android.remote.parse.adapter.UserProfileItemTypeAdapter;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lD.C43617a;
import lD.C43619c;

/* compiled from: ProfileJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/P6;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P6 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f144093d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final gD.h f144094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43619c f144095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.D2 f144096c;

    /* compiled from: ProfileJsonModule_ProvideTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/P6$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P6(@Y61.k gD.h hVar, @Y61.k C43619c c43619c, @Y61.k com.avito.android.D2 d22) {
        this.f144094a = hVar;
        this.f144095b = c43619c;
        this.f144096c = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gD.f fVar = (gD.f) this.f144094a.get();
        C43617a c43617a = (C43617a) this.f144095b.get();
        com.avito.android.B2 b22 = (com.avito.android.B2) this.f144096c.get();
        f144093d.getClass();
        N6.f144081a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(AuthResult.class, new AuthResultTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(LoginResult.Ok.class, new LoginResultOkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(UserProfileItem.class, new UserProfileItemTypeAdapter(fVar, c43617a, b22)));
        linkedHashSet.add(new com.avito.android.util.X5(SocialAuthResult.Ok.class, new SocialAuthResultOkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(SocialProceedResult.Ok.class, new SocialProceedResultOkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(RemovalProcessItem.class, new ProfileRemovalItemTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(RemovalButton.class, new ProfileRemovalButtonTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ParsingPermissionResult.Ok.class, new ParsingPermissionResultOkTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ActualizePhonesScenarioResult.class, new ActualizePhonesScenarioResultTypeAdapter()));
        return linkedHashSet;
    }
}
