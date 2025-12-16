package com.avito.android.profile.user_profile.header;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import androidx.view.C22977J;
import com.avito.android.profile.user_profile.D;
import com.avito.android.profile.user_profile.cards.o;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import com.avito.android.util.P5;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: ProfileHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/header/b;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f226152a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f226153b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final D f226154c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public UserProfileState.VisibleData.HeaderState f226155d;

    public b(@k D d12, @k l lVar, @k o oVar, @k C22977J c22977j) {
        this.f226152a = lVar;
        this.f226153b = oVar;
        this.f226154c = d12;
        C43175k.K(new C43197r1(new a(this, null), y.a(P5.g(d12.f224203g.f10415d))), c22977j);
    }
}
