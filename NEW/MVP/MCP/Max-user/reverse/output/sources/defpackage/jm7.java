package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class jm7 extends InputConnectionWrapper {
    public final /* synthetic */ km7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(InputConnection inputConnection, km7 km7Var) {
        super(inputConnection, false);
        this.a = km7Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        kce kceVar;
        if (inputContentInfo == null) {
            kceVar = null;
        } else {
            kceVar = new kce(23, new ukd(20, inputContentInfo));
        }
        if (this.a.j(kceVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
