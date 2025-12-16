package com.yandex.div.core.player;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.dagger.z;
import com.yandex.div.core.view2.divs.widgets.v;
import com.yandex.div2.C38383i8;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DivVideoActionHandler.kt */
@z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/player/f;", "", "<init>", "()V", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* compiled from: DivVideoActionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/player/f$a;", "", "<init>", "()V", "", "PAUSE_COMMAND", "Ljava/lang/String;", "START_COMMAND", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
    public f() {
    }

    public static v a(ViewGroup viewGroup, String str) {
        v vVarA;
        int childCount = viewGroup.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                return null;
            }
            int i13 = i12 + 1;
            View childAt = viewGroup.getChildAt(i12);
            if (childAt instanceof v) {
                v vVar = (v) childAt;
                C38383i8 div = vVar.getDiv();
                if (L.f(div != null ? div.f375373q : null, str)) {
                    return vVar;
                }
            }
            if ((childAt instanceof ViewGroup) && (vVarA = a((ViewGroup) childAt, str)) != null) {
                return vVarA;
            }
            i12 = i13;
        }
    }
}
