package com.avito.android.rating_form.item.stars;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Score.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/stars/Score;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Score {

    /* renamed from: c, reason: collision with root package name */
    public static final Score f248640c;

    /* renamed from: d, reason: collision with root package name */
    public static final Score f248641d;

    /* renamed from: e, reason: collision with root package name */
    public static final Score f248642e;

    /* renamed from: f, reason: collision with root package name */
    public static final Score f248643f;

    /* renamed from: g, reason: collision with root package name */
    public static final Score f248644g;

    /* renamed from: h, reason: collision with root package name */
    public static final Score f248645h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Score[] f248646i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f248647j;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f248648b;

    static {
        Score score = new Score(0, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_tap_to_rate, new Serializable[0]), "ZERO");
        f248640c = score;
        Score score2 = new Score(1, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_impossible_use, new Serializable[0]), "ONE");
        f248641d = score2;
        Score score3 = new Score(2, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_not_recommend, new Serializable[0]), "TWO");
        f248642e = score3;
        Score score4 = new Score(3, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_troubles, new Serializable[0]), "THREE");
        f248643f = score4;
        Score score5 = new Score(4, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_almost_good, new Serializable[0]), "FOUR");
        f248644g = score5;
        Score score6 = new Score(5, com.avito.android.printable_text.b.c(R.string.rating_form_score_text_excellent, new Serializable[0]), "FIVE");
        f248645h = score6;
        Score[] scoreArr = {score, score2, score3, score4, score5, score6};
        f248646i = scoreArr;
        f248647j = kotlin.enums.c.a(scoreArr);
    }

    public Score(int i12, PrintableText printableText, String str) {
        this.f248648b = printableText;
    }

    public static Score valueOf(String str) {
        return (Score) Enum.valueOf(Score.class, str);
    }

    public static Score[] values() {
        return (Score[]) f248646i.clone();
    }
}
