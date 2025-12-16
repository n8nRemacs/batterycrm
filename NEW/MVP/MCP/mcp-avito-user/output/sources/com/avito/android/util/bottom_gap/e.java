package com.avito.android.util.bottom_gap;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomOverlaysRegistry.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/bottom_gap/e;", "", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f318833a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f318834b = new ArrayList();

    /* compiled from: BottomOverlaysRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/bottom_gap/e$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k View view);

        void b(@k View view);
    }

    @Inject
    public e() {
    }
}
