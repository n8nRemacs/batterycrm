package com.avito.android.lib.design.action_menu;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.action_menu.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionMenuState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/action_menu/g;", "", "a", "b", "Lcom/avito/android/lib/design/action_menu/g$a;", "Lcom/avito/android/lib/design/action_menu/g$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g {

    /* compiled from: ActionMenuState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/action_menu/g$a;", "Lcom/avito/android/lib/design/action_menu/g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f.a f178260a;

        public a(@k f.a aVar) {
            super(aVar, null);
            this.f178260a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f178260a, ((a) obj).f178260a);
        }

        public final int hashCode() {
            return this.f178260a.hashCode();
        }

        @k
        public final String toString() {
            return "Bottom(gravity=" + this.f178260a + ')';
        }
    }

    /* compiled from: ActionMenuState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/action_menu/g$b;", "Lcom/avito/android/lib/design/action_menu/g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Top(gravity=null)";
        }
    }

    public g(f fVar, C42822w c42822w) {
    }
}
