package ru.ok.messages.utils;

import defpackage.ho7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/utils/EmptyVideoTokenException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyVideoTokenException extends IllegalStateException {
    @Override // java.lang.Throwable
    public final String getMessage() {
        return ho7.i("Video token is empty on forward, message=", getMessage(), ", video=null, from chat=null");
    }
}
