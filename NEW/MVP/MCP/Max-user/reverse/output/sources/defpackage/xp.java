package defpackage;

import scout.Component;

/* loaded from: classes2.dex */
public abstract class xp extends Component {
    /* JADX WARN: Illegal instructions before constructor call */
    public xp() {
        a1e a1eVar = iri.a;
        if (a1eVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!");
        }
        super(a1eVar);
    }
}
