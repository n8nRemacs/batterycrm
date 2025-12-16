package com.avito.android.rating_persistence.llm_summary;

import androidx.room.O0;
import j.N;

/* compiled from: RatingLLMSummaryDao_Impl.java */
/* loaded from: classes16.dex */
class c extends O0 {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "DELETE FROM rating_llm_summary WHERE feedback_sending_timestamp <= ?";
    }
}
