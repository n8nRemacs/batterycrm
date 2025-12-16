package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;

/* loaded from: classes2.dex */
public final /* synthetic */ class g6 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tzd tzdVar = (tzd) obj;
                int i2 = ActLocalMedias.p1;
                ((ActLocalMedias) obj2).U(new ss4(tzdVar.a.b(), tzdVar.b));
                break;
            case 1:
                tzd tzdVar2 = (tzd) obj;
                int i3 = ActPhotoEditor.W0;
                ((ActPhotoEditor) obj2).P(new ss4(tzdVar2.a.b(), tzdVar2.b));
                break;
            case 2:
                hx hxVar = (hx) obj2;
                Collection collection = (Collection) obj;
                wqi.c(hxVar.f, "ValidateMessagesTimeUseCase find some items for delete, count = " + collection.size(), new Object[0]);
                svi.e((nxg) hxVar.l.getValue(), null, null, new gx(hxVar, collection, null), 3);
                break;
            case 3:
                af2 af2Var = (af2) obj;
                for (iu3 iu3Var : (iu3[]) obj2) {
                    if (iu3Var != null) {
                        iu3Var.accept(af2Var);
                    }
                }
                break;
            case 4:
                ((af2) obj).h = (String) obj2;
                break;
            case 5:
                fy2 fy2Var = (fy2) obj2;
                af2 af2Var2 = (af2) obj;
                hf2 hf2Var = af2Var2.o;
                if (hf2Var == null) {
                    hf2Var = hf2.h;
                }
                af2Var2.o = po8.g(fy2Var, hf2Var);
                break;
            case 6:
                ((View) obj2).getWindowVisibleDisplayFrame((Rect) obj);
                break;
            default:
                ((ArrayList) obj2).addAll((List) obj);
                break;
        }
    }
}
