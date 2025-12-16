package com.avito.android.info.di;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.info.di.d;
import com.avito.android.info.ui.InfoActivity;
import h31.d;
import kotlin.Metadata;

/* compiled from: InfoActivityComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/info/di/b;", "", "a", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: InfoActivityComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/info/di/b$a;", "", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @k
        a a(@d.InterfaceC5064d @k String str);

        @h31.b
        @k
        a b(@d.b @k String str);

        @k
        b build();

        @h31.b
        @k
        a c(@d.c @l Bundle bundle);

        @k
        a d(@k c cVar);
    }

    void a(@k InfoActivity infoActivity);
}
