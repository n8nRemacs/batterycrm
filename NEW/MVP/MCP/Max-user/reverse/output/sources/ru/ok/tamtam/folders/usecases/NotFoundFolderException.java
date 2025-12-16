package ru.ok.tamtam.folders.usecases;

import defpackage.ho7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/folders/usecases/NotFoundFolderException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotFoundFolderException extends Exception {
    public NotFoundFolderException(String str) {
        super(ho7.i("Not found folder(", str, ")"));
    }
}
