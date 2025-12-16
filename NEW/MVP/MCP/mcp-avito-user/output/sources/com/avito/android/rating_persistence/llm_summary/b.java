package com.avito.android.rating_persistence.llm_summary;

import androidx.room.L;
import j.N;

/* compiled from: RatingLLMSummaryDao_Impl.java */
/* loaded from: classes16.dex */
class b extends L<g> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR IGNORE INTO `rating_llm_summary` (`summary_key`,`feedback_sending_timestamp`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@N Z1.i iVar, @N g gVar) {
        g gVar2 = gVar;
        iVar.h4(1, gVar2.f249811a);
        iVar.g1(2, gVar2.f249812b);
    }
}
