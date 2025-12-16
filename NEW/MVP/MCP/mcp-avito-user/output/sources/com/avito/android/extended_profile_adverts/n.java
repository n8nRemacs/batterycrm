package com.avito.android.extended_profile_adverts;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ProfileAdvertsUpdatesRelay.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_adverts/n;", "", "<init>", "()V", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f150955a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f150956b;

    /* compiled from: ProfileAdvertsUpdatesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_adverts/n$a;", "", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f150957a;

        /* renamed from: b, reason: collision with root package name */
        public final int f150958b;

        public a(@Y61.k String str, int i12) {
            this.f150957a = str;
            this.f150958b = i12;
        }
    }

    @Inject
    public n() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f150955a = e2VarB;
        this.f150956b = e2VarB;
    }
}
