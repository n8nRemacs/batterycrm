package com.avito.android.messenger.channels.mvi.presenter;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.architecture_components.D;
import j.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FoldersPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/a;", "LS20/a;", "Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a extends S20.a<b> {

    /* compiled from: FoldersPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.presenter.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5551a {

        /* renamed from: a, reason: collision with root package name */
        public final int f188286a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f188287b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f188288c;

        public C5551a(@e0 int i12, @k String str, @k String str2) {
            this.f188286a = i12;
            this.f188287b = str;
            this.f188288c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5551a)) {
                return false;
            }
            C5551a c5551a = (C5551a) obj;
            return this.f188286a == c5551a.f188286a && this.f188287b.equals(c5551a.f188287b) && L.f(this.f188288c, c5551a.f188288c);
        }

        public final int hashCode() {
            return this.f188288c.hashCode() + H.d(Integer.hashCode(this.f188286a) * 31, 31, this.f188287b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FolderTab(name=");
            sb2.append(this.f188286a);
            sb2.append(", folderId=");
            sb2.append(this.f188287b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f188288c, ')');
        }
    }

    /* compiled from: FoldersPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5552a f188289c = new C5552a(null);

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final b f188290d = new b(C42784z0.f406748b, 0);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C5551a> f188291a;

        /* renamed from: b, reason: collision with root package name */
        public final int f188292b;

        /* compiled from: FoldersPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/a$b$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.presenter.a$b$a, reason: collision with other inner class name */
        public static final class C5552a {
            public /* synthetic */ C5552a(C42822w c42822w) {
                this();
            }

            public C5552a() {
            }
        }

        public b(@k List<C5551a> list, int i12) {
            this.f188291a = list;
            this.f188292b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f188291a, bVar.f188291a) && this.f188292b == bVar.f188292b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f188292b) + (this.f188291a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(tabs=");
            sb2.append(this.f188291a);
            sb2.append(", selected=");
            return r.t(sb2, this.f188292b, ')');
        }
    }

    void T8(int i12);

    void d3();

    @k
    D ib();
}
