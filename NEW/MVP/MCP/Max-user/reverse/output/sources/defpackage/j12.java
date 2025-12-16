package defpackage;

/* loaded from: classes.dex */
public interface j12 extends ebd {
    public static final s90 h = new s90("camerax.core.camera.useCaseConfigFactory", axg.class, null);
    public static final s90 i = new s90("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final s90 j = new s90("camerax.core.camera.SessionProcessor", xie.class, null);
    public static final s90 k = new s90("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final s90 l = new s90("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void y() {
        if (d(j, null) != null) {
            throw new ClassCastException();
        }
    }
}
