package com.avito.android.player_holder;

import Y61.k;
import Y61.l;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlayerHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player_holder/a;", "", "_avito_player-holder_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: PlayerHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.player_holder.a$a, reason: collision with other inner class name */
    public static final class C6624a {
    }

    @l
    String A();

    void B(@k Y41.l<? super InterfaceC36534o, G0> lVar);

    void C();

    void D(@k String str);

    void E(@k StyledPlayerView styledPlayerView);

    void F(@k StyledPlayerView styledPlayerView);

    void G();

    void H(@k String str, @k d0.g gVar);

    void I(long j12);

    @k
    InterfaceC36534o J();

    @k
    InterfaceC36534o a();

    void b(@k String str);

    void c(@k String str);

    void d(@k ArrayList arrayList);

    void e(@k Y41.l<? super InterfaceC36534o, G0> lVar);

    void f(int i12, long j12);

    void g(@k String str, @k Y41.a<? extends d0.g> aVar);

    void pause();

    void play();

    void prepare();

    void r(@k O o12);

    void s();

    void t(@k String str, @k d0.g gVar);

    void u(@k StyledPlayerView styledPlayerView);

    void v(@l String str);

    void w(@k StyledPlayerView styledPlayerView);

    void x(@k String str, @k com.google.android.exoplayer2.analytics.b bVar);

    void y();

    void z(@k O o12, @l y.a aVar);
}
