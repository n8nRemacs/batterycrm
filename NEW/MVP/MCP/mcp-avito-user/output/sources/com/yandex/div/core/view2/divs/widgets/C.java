package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import com.yandex.div.core.view2.C38029k;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ReleaseUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/C;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C f368870a = new C();

    public static void a(@Y61.k ViewGroup viewGroup, @Y61.k C38029k c38029k) {
        Iterator itA = C22816e.a(viewGroup);
        while (true) {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                viewGroup.removeAllViews();
                return;
            } else {
                x.a(c38029k.getReleaseViewVisitor$div_release(), (View) c22833m0.next());
            }
        }
    }
}
