package org.mockito.exceptions.base;

import java.io.ObjectStreamException;
import org.mockito.internal.exceptions.stacktrace.a;

/* loaded from: classes7.dex */
public class MockitoSerializationIssue extends ObjectStreamException {
    public MockitoSerializationIssue(String str, Exception exc) {
        super(str);
        initCause(exc);
        super.getStackTrace();
        new a().a(this);
    }
}
