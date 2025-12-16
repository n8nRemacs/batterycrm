package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final /* synthetic */ class m17 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ m17(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                this.b.add(new AbstractMap.SimpleEntry(((String) entry.getKey()).toLowerCase(), (String) ((List) entry.getValue()).stream().collect(Collectors.joining(","))));
                break;
            case 1:
                this.b.add((Map.Entry) obj);
                break;
            default:
                btc btcVar = (btc) obj;
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        if (arrayList.get(i) != olb.h) {
                            ((Consumer) arrayList.get(i)).accept((atc) btcVar.c.get(i));
                        }
                        i++;
                    }
                }
        }
    }
}
