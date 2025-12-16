package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantDataField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "text", "textArea", "phone", "date", "dateTime", "bool", "select", "selectDropdown", "multiSelect", "countrySelect", "fileAttachment", "multiFileAttachments", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public enum FieldType {
    text,
    textArea,
    phone,
    date,
    dateTime,
    bool,
    select,
    selectDropdown,
    multiSelect,
    countrySelect,
    fileAttachment,
    multiFileAttachments;


    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldType$a;", "", "", "type", "Lru/cyberity/cbr/core/data/model/FieldType;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.FieldType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.l
        public final FieldType a(@Y61.l String type) {
            for (FieldType fieldType : FieldType.values()) {
                if (L.f(fieldType.name(), type)) {
                    return fieldType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
