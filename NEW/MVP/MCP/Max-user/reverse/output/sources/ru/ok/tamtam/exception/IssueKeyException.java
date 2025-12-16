package ru.ok.tamtam.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/exception/IssueKeyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-coroutines"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class IssueKeyException extends Exception {
    public final String a;

    public IssueKeyException(String str, String str2, Throwable th) {
        super(str2, th);
        this.a = str;
    }
}
