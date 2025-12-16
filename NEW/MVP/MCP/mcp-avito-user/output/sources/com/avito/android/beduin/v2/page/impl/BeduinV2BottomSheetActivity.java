package com.avito.android.beduin.v2.page.impl;

import Ii.InterfaceC14111a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2PageActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2BottomSheetActivity;", "Lcom/avito/android/beduin/v2/page/e;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2BottomSheetActivity extends com.avito.android.beduin.v2.page.e {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f104839n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C28864a f104840m;

    /* compiled from: BeduinV2PageActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2BottomSheetActivity$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ((InterfaceC14111a.b) C29972i.a(C29972i.b(this), InterfaceC14111a.b.class)).Ec().create().a(this);
    }

    @Override // com.avito.android.beduin.v2.page.e
    @Y61.k
    public final com.avito.android.beduin.v2.page.l a2() {
        C28864a c28864a = this.f104840m;
        if (c28864a != null) {
            return c28864a;
        }
        return null;
    }
}
