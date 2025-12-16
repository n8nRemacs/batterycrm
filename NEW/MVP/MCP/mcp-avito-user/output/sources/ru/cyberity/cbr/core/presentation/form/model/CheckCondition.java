package ru.cyberity.cbr.core.presentation.form.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Conditions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/CheckCondition;", "", "conditionalPart", "", "sectionId", "itemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConditionalPart", "()Ljava/lang/String;", "getItemId", "getSectionId", "EqualCheck", "ExistsCheck", "NotEqualCheck", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$EqualCheck;", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$ExistsCheck;", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$NotEqualCheck;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CheckCondition {

    @k
    private final String conditionalPart;

    @k
    private final String itemId;

    @k
    private final String sectionId;

    /* compiled from: Conditions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$EqualCheck;", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition;", "conditionalPart", "", "sectionId", "itemId", "optionShouldBeEqualCheck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConditionalPart", "()Ljava/lang/String;", "getItemId", "getOptionShouldBeEqualCheck", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EqualCheck extends CheckCondition {

        @k
        private final String conditionalPart;

        @k
        private final String itemId;

        @k
        private final String optionShouldBeEqualCheck;

        @k
        private final String sectionId;

        public EqualCheck(@k String str, @k String str2, @k String str3, @k String str4) {
            super(str, str3, str2, null);
            this.conditionalPart = str;
            this.sectionId = str2;
            this.itemId = str3;
            this.optionShouldBeEqualCheck = str4;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getConditionalPart() {
            return this.conditionalPart;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getItemId() {
            return this.itemId;
        }

        @k
        public final String getOptionShouldBeEqualCheck() {
            return this.optionShouldBeEqualCheck;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getSectionId() {
            return this.sectionId;
        }
    }

    /* compiled from: Conditions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$ExistsCheck;", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition;", "conditionalPart", "", "sectionId", "itemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConditionalPart", "()Ljava/lang/String;", "getItemId", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ExistsCheck extends CheckCondition {

        @k
        private final String conditionalPart;

        @k
        private final String itemId;

        @k
        private final String sectionId;

        public ExistsCheck(@k String str, @k String str2, @k String str3) {
            super(str, str3, str2, null);
            this.conditionalPart = str;
            this.sectionId = str2;
            this.itemId = str3;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getConditionalPart() {
            return this.conditionalPart;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getItemId() {
            return this.itemId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getSectionId() {
            return this.sectionId;
        }
    }

    /* compiled from: Conditions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/CheckCondition$NotEqualCheck;", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition;", "conditionalPart", "", "sectionId", "itemId", "optionShouldNotBeEqualCheck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConditionalPart", "()Ljava/lang/String;", "getItemId", "getOptionShouldNotBeEqualCheck", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NotEqualCheck extends CheckCondition {

        @k
        private final String conditionalPart;

        @k
        private final String itemId;

        @k
        private final String optionShouldNotBeEqualCheck;

        @k
        private final String sectionId;

        public NotEqualCheck(@k String str, @k String str2, @k String str3, @k String str4) {
            super(str, str3, str2, null);
            this.conditionalPart = str;
            this.sectionId = str2;
            this.itemId = str3;
            this.optionShouldNotBeEqualCheck = str4;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getConditionalPart() {
            return this.conditionalPart;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getItemId() {
            return this.itemId;
        }

        @k
        public final String getOptionShouldNotBeEqualCheck() {
            return this.optionShouldNotBeEqualCheck;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.CheckCondition
        @k
        public String getSectionId() {
            return this.sectionId;
        }
    }

    public /* synthetic */ CheckCondition(String str, String str2, String str3, C42822w c42822w) {
        this(str, str2, str3);
    }

    @k
    public String getConditionalPart() {
        return this.conditionalPart;
    }

    @k
    public String getItemId() {
        return this.itemId;
    }

    @k
    public String getSectionId() {
        return this.sectionId;
    }

    private CheckCondition(String str, String str2, String str3) {
        this.conditionalPart = str;
        this.sectionId = str2;
        this.itemId = str3;
    }
}
