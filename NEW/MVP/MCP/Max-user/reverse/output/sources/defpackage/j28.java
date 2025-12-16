package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import one.me.location.map.pick.PickLocationScreen;
import ru.ok.messages.location.FrgLocationMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class j28 implements mi4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ j28(int i, long j) {
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", gwi.b(new imb("ru.ok.tamtam.extra.REQUEST_CODE", Integer.valueOf(this.c)), new imb("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(this.b))));
            default:
                return new PickLocationScreen(this.b, this.c);
        }
    }

    public /* synthetic */ j28(long j, int i) {
        this.b = j;
        this.c = i;
    }
}
