package com.avito.android.rating.user_contacts.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserContactsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f247808f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f247809g = new b(C42784z0.f406748b, InterfaceC7440b.a.f247814a, false, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f247810b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC7440b f247811c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f247812d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f247813e;

    /* compiled from: UserContactsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/b$a;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserContactsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/b$b;", "", "a", "b", "Lcom/avito/android/rating/user_contacts/mvi/entity/b$b$a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b$b$b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.user_contacts.mvi.entity.b$b, reason: collision with other inner class name */
    public interface InterfaceC7440b {

        /* compiled from: UserContactsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/b$b$a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b$b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating.user_contacts.mvi.entity.b$b$a */
        public static final class a implements InterfaceC7440b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f247814a = new a();
        }

        /* compiled from: UserContactsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/b$b$b;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b$b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating.user_contacts.mvi.entity.b$b$b, reason: collision with other inner class name */
        public static final class C7441b implements InterfaceC7440b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C7441b f247815a = new C7441b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k List<? extends com.avito.conveyor_item.a> list, @l InterfaceC7440b interfaceC7440b, boolean z12, @l Uri uri) {
        this.f247810b = list;
        this.f247811c = interfaceC7440b;
        this.f247812d = z12;
        this.f247813e = uri;
    }

    public static b a(b bVar, List list, InterfaceC7440b interfaceC7440b, int i12) {
        if ((i12 & 1) != 0) {
            list = bVar.f247810b;
        }
        if ((i12 & 2) != 0) {
            interfaceC7440b = bVar.f247811c;
        }
        boolean z12 = (i12 & 4) != 0 ? bVar.f247812d : true;
        Uri uri = bVar.f247813e;
        bVar.getClass();
        return new b(list, interfaceC7440b, z12, uri);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f247810b, bVar.f247810b) && L.f(this.f247811c, bVar.f247811c) && this.f247812d == bVar.f247812d && L.f(this.f247813e, bVar.f247813e);
    }

    public final int hashCode() {
        int iHashCode = this.f247810b.hashCode() * 31;
        InterfaceC7440b interfaceC7440b = this.f247811c;
        int i12 = r.i((iHashCode + (interfaceC7440b == null ? 0 : interfaceC7440b.hashCode())) * 31, 31, this.f247812d);
        Uri uri = this.f247813e;
        return i12 + (uri != null ? uri.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserContactsState(items=");
        sb2.append(this.f247810b);
        sb2.append(", loading=");
        sb2.append(this.f247811c);
        sb2.append(", isError=");
        sb2.append(this.f247812d);
        sb2.append(", nextPage=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f247813e, ')');
    }
}
