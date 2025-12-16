package e11;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: e11.s1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39905s1 extends AbstractC39858c1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final HashMap<String, J0<com.my.target.common.models.a>> f394792b;

    public C39905s1() {
        HashMap<String, J0<com.my.target.common.models.a>> map = new HashMap<>();
        this.f394792b = map;
        map.put(InstreamAdBreakType.PREROLL, new J0<>(InstreamAdBreakType.PREROLL));
        map.put(InstreamAdBreakType.PAUSEROLL, new J0<>(InstreamAdBreakType.PAUSEROLL));
        map.put(InstreamAdBreakType.MIDROLL, new J0<>(InstreamAdBreakType.MIDROLL));
        map.put(InstreamAdBreakType.POSTROLL, new J0<>(InstreamAdBreakType.POSTROLL));
    }

    @Override // e11.AbstractC39858c1
    public final int a() {
        Iterator<J0<com.my.target.common.models.a>> it = this.f394792b.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().f394373d.size();
        }
        return size;
    }
}
