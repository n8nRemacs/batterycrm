package com.avito.android.replace_main.toggle;

import android.content.Context;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import j.InterfaceC42161q;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReplaceMainToggleViewFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/replace_main/toggle/v;", "", "a", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface v {

    /* compiled from: ReplaceMainToggleViewFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/replace_main/toggle/v$a;", "", "a", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f254657a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C7618a f254658b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<BottomNavigationSpace, G0> f254659c;

        /* compiled from: ReplaceMainToggleViewFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/v$a$a;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.replace_main.toggle.v$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7618a {

            /* renamed from: a, reason: collision with root package name */
            public final int f254660a;

            /* renamed from: b, reason: collision with root package name */
            public final int f254661b;

            public C7618a(@InterfaceC42161q int i12, @InterfaceC42161q int i13) {
                this.f254660a = i12;
                this.f254661b = i13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7618a)) {
                    return false;
                }
                C7618a c7618a = (C7618a) obj;
                return this.f254660a == c7618a.f254660a && this.f254661b == c7618a.f254661b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f254661b) + (Integer.hashCode(this.f254660a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Padding(horizontal=");
                sb2.append(this.f254660a);
                sb2.append(", vertical=");
                return androidx.appcompat.app.r.t(sb2, this.f254661b, ')');
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Context context, @Y61.k C7618a c7618a, @Y61.k Y41.l<? super BottomNavigationSpace, G0> lVar) {
            this.f254657a = context;
            this.f254658b = c7618a;
            this.f254659c = lVar;
        }
    }

    @Y61.k
    A a(@Y61.k a aVar);
}
