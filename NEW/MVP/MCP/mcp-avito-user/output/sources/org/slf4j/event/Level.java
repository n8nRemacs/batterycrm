package org.slf4j.event;

/* loaded from: classes7.dex */
public enum Level {
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    WARN("WARN"),
    /* JADX INFO: Fake field, exist only in values array */
    INFO("INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG("DEBUG"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE("TRACE");


    /* renamed from: b, reason: collision with root package name */
    public final String f421821b;

    Level(String str) {
        this.f421821b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f421821b;
    }
}
