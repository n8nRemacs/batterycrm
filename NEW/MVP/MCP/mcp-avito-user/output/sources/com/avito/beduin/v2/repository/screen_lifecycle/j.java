package com.avito.beduin.v2.repository.screen_lifecycle;

import androidx.view.M0;
import androidx.view.P0;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ScreenIdHolderViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/j;", "Landroidx/lifecycle/M0;", "<init>", "()V", "a", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f338315E = UUID.randomUUID().toString();

    /* compiled from: ScreenIdHolderViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/j$a;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements P0.c {
        @Override // androidx.lifecycle.P0.c
        @Y61.k
        public final <T extends M0> T create(@Y61.k Class<T> cls) {
            return new j();
        }
    }
}
