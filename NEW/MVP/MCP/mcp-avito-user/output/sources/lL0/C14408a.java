package Ll0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.social.M;
import com.avito.android.social.SocialType;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoSocialTypeToStringMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLl0/a;", "Lcom/avito/android/social/M;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ll0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14408a implements M {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Q<SocialType, String>> f10098a = C42745f0.U(new Q(SocialType.f284279b, "gp"), new Q(SocialType.f284280c, "LiveJournal"), new Q(SocialType.f284281d, "Mail"), new Q(SocialType.f284282e, "ok"), new Q(SocialType.f284283f, "Twitter"), new Q(SocialType.f284284g, "vk"), new Q(SocialType.f284285h, "vk-id"), new Q(SocialType.f284287j, "apple"), new Q(SocialType.f284286i, "esia-id"), new Q(SocialType.f284288k, "avitofake"));

    @Inject
    public C14408a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.social.M
    @l
    public final String a(@l SocialType socialType) {
        Object next;
        Iterator<T> it = this.f10098a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Q) next).f406619b == socialType) {
                break;
            }
        }
        Q q12 = (Q) next;
        if (q12 != null) {
            return (String) q12.f406620c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.social.M
    @l
    public final SocialType b(@l String str) {
        Object next;
        Iterator<T> it = this.f10098a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Q) next).f406620c, str)) {
                break;
            }
        }
        Q q12 = (Q) next;
        if (q12 != null) {
            return (SocialType) q12.f406619b;
        }
        return null;
    }

    @Override // com.avito.android.social.M
    @k
    public final SocialType c(@l String str) {
        SocialType socialTypeB = b(str);
        if (socialTypeB != null) {
            return socialTypeB;
        }
        throw new IllegalArgumentException(C22491k0.a('\'', "Unknown Social Type: '", str).toString());
    }

    @Override // com.avito.android.social.M
    @k
    public final String d(@l SocialType socialType) {
        String strA = a(socialType);
        if (strA != null) {
            return strA;
        }
        throw new IllegalArgumentException(("Unknown Social Type: '" + socialType + '\'').toString());
    }
}
