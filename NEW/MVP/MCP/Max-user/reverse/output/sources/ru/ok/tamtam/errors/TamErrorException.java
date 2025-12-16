package ru.ok.tamtam.errors;

import defpackage.pzf;

/* loaded from: classes2.dex */
public class TamErrorException extends Exception {
    public final pzf a;

    public TamErrorException(pzf pzfVar) {
        super(pzfVar.b);
        this.a = pzfVar;
    }
}
