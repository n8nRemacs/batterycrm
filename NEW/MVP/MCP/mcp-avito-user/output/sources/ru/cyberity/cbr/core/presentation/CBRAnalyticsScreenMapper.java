package ru.cyberity.cbr.core.presentation;

import Y41.l;
import Y61.k;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.analytics.Screen;

/* compiled from: CBRAnalyticsScreenMapper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\r\u001a\u00020\f2'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004j\u0002`\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R;\u0010\u0012\u001a)\u0012%\u0012#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004j\u0002`\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/presentation/CBRAnalyticsScreenMapper;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "Lkotlin/S;", "name", "fragment", "Lru/cyberity/cbr/core/analytics/Screen;", "Lru/cyberity/cbr/core/presentation/FragmentToScreenMapper;", "mapper", "Lkotlin/G0;", "addMapping", "(LY41/l;)V", "getScreenByFragment", "(Landroidx/fragment/app/Fragment;)Lru/cyberity/cbr/core/analytics/Screen;", "", "fragmentMappings", "Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRAnalyticsScreenMapper {

    @k
    public static final CBRAnalyticsScreenMapper INSTANCE = new CBRAnalyticsScreenMapper();

    @k
    private static final List<l<Fragment, Screen>> fragmentMappings = new ArrayList();

    private CBRAnalyticsScreenMapper() {
    }

    public final void addMapping(@k l<? super Fragment, ? extends Screen> mapper) {
        fragmentMappings.add(mapper);
    }

    @k
    public final Screen getScreenByFragment(@k Fragment fragment) {
        Object next;
        Screen screen;
        Iterator<T> it = fragmentMappings.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((l) next).invoke(fragment) != null) {
                break;
            }
        }
        l lVar = (l) next;
        return (lVar == null || (screen = (Screen) lVar.invoke(fragment)) == null) ? Screen.Other : screen;
    }
}
