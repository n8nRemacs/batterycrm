package YX0;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class a extends CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    @RX0.a
    public final void fillWindow(int i12, @N CursorWindow cursorWindow) {
        throw null;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    @RX0.a
    @P
    public final CursorWindow getWindow() {
        throw null;
    }

    @Override // android.database.CursorWrapper
    @N
    public final /* synthetic */ Cursor getWrappedCursor() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i12, int i13) {
        throw null;
    }
}
