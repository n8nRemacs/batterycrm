package ir;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import hw.InterfaceC41177b;
import j.InterfaceC42161q;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileSnippet.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lir/e;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: ProfileSnippet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(e eVar, CharSequence charSequence, Integer num, int i12) {
            if ((i12 & 4) != 0) {
                num = null;
            }
            eVar.f(charSequence, num);
        }
    }

    void P3(@l List<SerpBadge> list);

    void a(@l Y41.a<G0> aVar);

    void b(@l com.avito.android.image_loader.a aVar, @k UserIconType userIconType, @l AvatarShape avatarShape);

    void c(@l Float f12, @l CharSequence charSequence);

    void d(@l Y41.a<G0> aVar);

    void e(@l CharSequence charSequence);

    void f(@l CharSequence charSequence, @InterfaceC42161q @l Integer num);

    void g(@l CharSequence charSequence);

    void gb(@l String str, @l String str2, @l UniversalColor universalColor);

    void h(@l CharSequence charSequence);

    void hb(@l Y41.l<? super Integer, G0> lVar);

    void setSubtitle(@l CharSequence charSequence);

    void setTitle(@l CharSequence charSequence);
}
