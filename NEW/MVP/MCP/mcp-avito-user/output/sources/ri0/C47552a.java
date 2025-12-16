package rI0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertActionConfirmedData.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrI0/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C47552a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f429724a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429725b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserAdvertActionType f429726c;

    public C47552a(@k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map, @k String str, @k UserAdvertActionType userAdvertActionType) {
        this.f429724a = map;
        this.f429725b = str;
        this.f429726c = userAdvertActionType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47552a)) {
            return false;
        }
        C47552a c47552a = (C47552a) obj;
        return L.f(this.f429724a, c47552a.f429724a) && L.f(this.f429725b, c47552a.f429725b) && L.f(this.f429726c, c47552a.f429726c);
    }

    public final int hashCode() {
        return this.f429726c.hashCode() + H.d(this.f429724a.hashCode() * 31, 31, this.f429725b);
    }

    @k
    public final String toString() {
        return "UserAdvertActionConfirmedData(selectedGroupInfo=" + this.f429724a + ", currentShortcut=" + this.f429725b + ", type=" + this.f429726c + ')';
    }
}
