package com.otaliastudios.transcoder.internal.utils;

import com.otaliastudios.transcoder.common.TrackType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: TrackMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/utils/m;", "T", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface m<T> extends Iterable<T>, Z41.a {

    /* compiled from: TrackMap.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        @Y61.l
        public static <T> T a(@Y61.k m<T> mVar, @Y61.k TrackType trackType) {
            if (mVar.K1(trackType)) {
                return mVar.n6(trackType);
            }
            return null;
        }

        @Y61.k
        public static <T> Iterator<T> b(@Y61.k m<T> mVar) {
            return C42756l.B(new Object[]{mVar.L0(), mVar.g3()}).iterator();
        }
    }

    boolean K1(@Y61.k TrackType trackType);

    @Y61.l
    T L0();

    boolean b3();

    @Y61.l
    T c4(@Y61.k TrackType trackType);

    @Y61.l
    T g3();

    boolean getHasVideo();

    int getSize();

    T n6(@Y61.k TrackType trackType);

    T q2();

    T u();
}
