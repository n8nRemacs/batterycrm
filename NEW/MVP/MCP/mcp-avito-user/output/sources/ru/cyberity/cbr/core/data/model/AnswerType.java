package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnswerType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/data/model/AnswerType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "Ignored", "Red", "Yellow", "Green", "Error", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public enum AnswerType {
    Ignored("IGNORED"),
    Red("RED"),
    Yellow("YELLOW"),
    Green("GREEN"),
    Error("ERROR");


    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private final String value;

    /* compiled from: AnswerType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/AnswerType$a;", "", "", "value", "Lru/cyberity/cbr/core/data/model/AnswerType;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.AnswerType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final AnswerType a(@Y61.l String value) {
            AnswerType answerType;
            AnswerType[] answerTypeArrValues = AnswerType.values();
            int length = answerTypeArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    answerType = null;
                    break;
                }
                answerType = answerTypeArrValues[i12];
                if (L.f(answerType.getValue(), value)) {
                    break;
                }
                i12++;
            }
            return answerType == null ? AnswerType.Error : answerType;
        }

        private Companion() {
        }
    }

    AnswerType(String str) {
        this.value = str;
    }

    @Y61.k
    public final String getValue() {
        return this.value;
    }
}
